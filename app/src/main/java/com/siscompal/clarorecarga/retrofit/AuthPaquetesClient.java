package com.siscompal.clarorecarga.retrofit;

import com.siscompal.clarorecarga.common.Constantes;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AuthPaquetesClient {
    private static AuthPaquetesClient instance = null;
    private AuthPaqueteService authPaqueteService;
    private Retrofit retrofit;

    public AuthPaquetesClient() {
//Incluir en la cabezera de la peticion el Token que autoriza al usuario
        OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();
        okHttpClientBuilder.addInterceptor(new AuthInterceptor());
        OkHttpClient cliente=okHttpClientBuilder.build();


        retrofit = new Retrofit.Builder()
                .baseUrl(Constantes.API_CLARORECARGA_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(cliente)
                .build();

        authPaqueteService = retrofit.create(AuthPaqueteService.class);
  }

   //Patrón Singleton
   public static AuthPaquetesClient getInstance() {
       if(instance == null){
           instance = new AuthPaquetesClient();

       }
       return instance;
   }

   public AuthPaqueteService getAuthPaquetesService() {
        return authPaqueteService;
   }


}