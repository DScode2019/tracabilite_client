package API_Palette.controllers;

import API_Palette.models.Palette;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.Callback;
import retrofit2.converter.gson.GsonConverterFactory;
import sun.rmi.runtime.Log;

public class PaletteServiceClient {



    public static void main(String[] args)
    {
        //PaletteServiceClient tt=new PaletteServiceClient();
        PaletteController palcont=new PaletteController();

        Palette p=new Palette();
        p.setIdPalette(1);
        p.setCodePalette("123");
        p.setNombre(2);
        p.setPoids(20);
        palcont.createPalette(p);




    }



}
