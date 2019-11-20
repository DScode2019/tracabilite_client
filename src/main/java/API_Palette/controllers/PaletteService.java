package API_Palette.controllers;

import API_Palette.models.Palette;

import retrofit2.Call;
import retrofit2.http.*;

public interface PaletteService {




    @GET("Palettes/{id}")
    public Call<Palette> getpalette(@Path("id") int id);

   /* @POST("/Palette")
    @FormUrlEncoded
    Call<Palette> postPalette(@Field("code_palette") String codePalette,
                              @Field("poids") int poids,
                              @Field("nombre") int nombre);*/
    @POST("/Palette")
   // @FormUrlEncoded
    Call<Palette> postPalette(@Body Palette palette);



}
