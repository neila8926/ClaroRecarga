package com.siscompal.clarorecarga.retrofit;

import com.siscompal.clarorecarga.common.Constantes;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ClaroRecargaClient {
    private static ClaroRecargaClient instance = null;
    private RecargasClaroService recargasClaroService;
    private Retrofit retrofit;

    public ClaroRecargaClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl(Constantes.API_CLARORECARGA_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        recargasClaroService = retrofit.create(RecargasClaroService.class);
  }

   //Patrón Singleton
   public static ClaroRecargaClient getInstance() {
       if(instance == null){
           instance = new ClaroRecargaClient();

       }
       return instance;
   }

   public RecargasClaroService getRecargasClaroService() {
        return recargasClaroService;
   }


}