package com.siscompal.clarorecarga.retrofit;

import com.siscompal.clarorecarga.retrofit.response.Datum;
import com.siscompal.clarorecarga.retrofit.response.Paquete;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AuthPaqueteService {
    @GET("products/voz")
    Call<Paquete> getPaquetesVoz();
    @GET("products/navegacion")
    Call<Paquete> getPaquetesInternet();
    @GET("products/todoIncluido")
    Call<Paquete> getPaquetesTodoIncluido();
    @GET("products/chat")
    Call<Paquete> getPaquetesChat();
    @GET("products/internetInalambrico")
    Call<Paquete> getPaquetesInternetInal();
    @GET("products/apps")
    Call<Paquete> getPaquetesApps();
    @GET("products/tv")
    Call<Paquete> getPaquetesTv();
    @GET("products/minuteras")
    Call<Paquete> getPaquetesMinuteros();
    @GET("products/largaDistancia")
    Call<Paquete> getPaquetesLargaDistancia();
}
