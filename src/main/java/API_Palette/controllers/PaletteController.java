package API_Palette.controllers;

import API_Palette.models.Palette;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PaletteController {

    OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://192.168.1.203:3200/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient.build())
            .build();

    PaletteService service = retrofit.create(PaletteService.class);

    public void createPalette(Palette palette) {

        Call<Palette> PaletteCall = service.postPalette(palette);
        PaletteCall.enqueue(new Callback<Palette>() {
            @Override
            public void onResponse(Call<Palette> call, Response<Palette> response) {

                if(response.isSuccessful()) {
                    System.out.println("post submitted to API. " +response.body().getCodePalette());
                    //  Log.i(TAG, "post submitted to API." + response.body().toString());

                }
            }

            @Override  public void onFailure(Call<Palette> call, Throwable t) {
                System.out.println( "Unable to submit post to API.");
            }
        });
    }
}
