package com.siscompal.clarorecarga.data;

import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.siscompal.clarorecarga.common.MyApp;
import com.siscompal.clarorecarga.retrofit.AuthPaqueteService;
import com.siscompal.clarorecarga.retrofit.AuthPaquetesClient;
import com.siscompal.clarorecarga.retrofit.response.Datum;
import com.siscompal.clarorecarga.retrofit.response.Paquete;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PaqueteRepository {
    AuthPaqueteService authPaqueteService;
    AuthPaquetesClient authPaquetesClient;
    LiveData<List<Datum>> paquetesVoz;
    LiveData<List<Datum>> paquetesInternet;
    LiveData<List<Datum>> paquetesTodoIncluido;
    LiveData<List<Datum>> paquetesChat;
    LiveData<List<Datum>> paqueteApps;
    LiveData<List<Datum>> paqueteLargaDistancia;
    LiveData<List<Datum>> paqueteMinutero;
    LiveData<List<Datum>> paqueteTv;
    LiveData<List<Datum>> paqueteInternetPrepago;

    PaqueteRepository(){
        authPaquetesClient = AuthPaquetesClient.getInstance();
        authPaqueteService=authPaquetesClient.getAuthPaquetesService();
        paquetesVoz = getPaquetesVoz();
        paquetesInternet=getPaquetesInternet();
        paquetesTodoIncluido=getPaquetesTodoIncluido();
        paquetesChat=getPaquetesChat();
        paqueteApps=getPaquetesApps();
        paqueteLargaDistancia=getPaquetesLargaDistancia();
        paqueteMinutero=getPaqueteMinutero();
        paqueteTv=getPaqueteTv();
        paqueteInternetPrepago=getPaqueteInternetPrepago();


    }

    public LiveData<List<Datum>> getPaquetesVoz(){
        final MutableLiveData<List<Datum>> data = new MutableLiveData<>();

        Call<Paquete> call= authPaqueteService.getPaquetesVoz();
        call.enqueue(new Callback<Paquete>() {
            @Override
            public void onResponse(Call<Paquete> call, Response<Paquete> response) {
                if(response.isSuccessful()){
                    data.setValue(response.body().getData());


                }else{
                    Toast.makeText(MyApp.getContext(), "Algo está muy mal", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Paquete> call, Throwable t) {
                Toast.makeText(MyApp.getContext(), "Error en la Conexión", Toast.LENGTH_SHORT).show();


            }
        });
        return data;
    }
    public LiveData<List<Datum>> getPaquetesInternet(){

        final MutableLiveData<List<Datum>> data = new MutableLiveData<>();

        Call<Paquete> call= authPaqueteService.getPaquetesInternet();
        call.enqueue(new Callback<Paquete>() {
            @Override
            public void onResponse(Call<Paquete> call, Response<Paquete> response) {
                if(response.isSuccessful()){
                    data.setValue(response.body().getData());


                }else{
                    Toast.makeText(MyApp.getContext(), "Algo está muy mal Internet", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Paquete> call, Throwable t) {
                Toast.makeText(MyApp.getContext(), "Error en la Conexión Internet", Toast.LENGTH_SHORT).show();


            }
        });
        return data;


    }
    public LiveData<List<Datum>> getPaquetesTodoIncluido(){
        final MutableLiveData<List<Datum>> data = new MutableLiveData<>();

        Call<Paquete> call= authPaqueteService.getPaquetesTodoIncluido();
        call.enqueue(new Callback<Paquete>() {
            @Override
            public void onResponse(Call<Paquete> call, Response<Paquete> response) {
                if(response.isSuccessful()){
                    data.setValue(response.body().getData());


                }else{
                    Toast.makeText(MyApp.getContext(), "Algo está muy mal", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Paquete> call, Throwable t) {
                Toast.makeText(MyApp.getContext(), "Error en la Conexión", Toast.LENGTH_SHORT).show();


            }
        });
        return data;
    }
    public LiveData<List<Datum>> getPaquetesChat(){
        final MutableLiveData<List<Datum>> data = new MutableLiveData<>();

        Call<Paquete> call= authPaqueteService.getPaquetesChat();
        call.enqueue(new Callback<Paquete>() {
            @Override
            public void onResponse(Call<Paquete> call, Response<Paquete> response) {
                if(response.isSuccessful()){
                    data.setValue(response.body().getData());


                }else{
                    Toast.makeText(MyApp.getContext(), "Algo está muy mal", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Paquete> call, Throwable t) {
                Toast.makeText(MyApp.getContext(), "Error en la Conexión", Toast.LENGTH_SHORT).show();


            }
        });
        return data;
    }
    public LiveData<List<Datum>> getPaquetesApps(){
        final MutableLiveData<List<Datum>> data = new MutableLiveData<>();

        Call<Paquete> call= authPaqueteService.getPaquetesApps();
        call.enqueue(new Callback<Paquete>() {
            @Override
            public void onResponse(Call<Paquete> call, Response<Paquete> response) {
                if(response.isSuccessful()){
                    data.setValue(response.body().getData());


                }else{
                    Toast.makeText(MyApp.getContext(), "Algo está muy mal", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Paquete> call, Throwable t) {
                Toast.makeText(MyApp.getContext(), "Error en la Conexión", Toast.LENGTH_SHORT).show();


            }
        });
        return data;
    }
    public LiveData<List<Datum>> getPaquetesLargaDistancia(){
        final MutableLiveData<List<Datum>> data = new MutableLiveData<>();

        Call<Paquete> call= authPaqueteService.getPaquetesLargaDistancia();
        call.enqueue(new Callback<Paquete>() {
            @Override
            public void onResponse(Call<Paquete> call, Response<Paquete> response) {
                if(response.isSuccessful()){
                    data.setValue(response.body().getData());


                }else{
                    Toast.makeText(MyApp.getContext(), "Algo está muy mal", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Paquete> call, Throwable t) {
                Toast.makeText(MyApp.getContext(), "Error en la Conexión", Toast.LENGTH_SHORT).show();


            }
        });
        return data;
    }
    public LiveData<List<Datum>> getPaqueteMinutero(){
        final MutableLiveData<List<Datum>> data = new MutableLiveData<>();

        Call<Paquete> call= authPaqueteService.getPaquetesMinuteros();
        call.enqueue(new Callback<Paquete>() {
            @Override
            public void onResponse(Call<Paquete> call, Response<Paquete> response) {
                if(response.isSuccessful()){
                    data.setValue(response.body().getData());


                }else{
                    Toast.makeText(MyApp.getContext(), "Algo está muy mal", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Paquete> call, Throwable t) {
                Toast.makeText(MyApp.getContext(), "Error en la Conexión", Toast.LENGTH_SHORT).show();


            }
        });
        return data;
    }
    public LiveData<List<Datum>> getPaqueteTv(){
        final MutableLiveData<List<Datum>> data = new MutableLiveData<>();

        Call<Paquete> call= authPaqueteService.getPaquetesTv();
        call.enqueue(new Callback<Paquete>() {
            @Override
            public void onResponse(Call<Paquete> call, Response<Paquete> response) {
                if(response.isSuccessful()){
                    data.setValue(response.body().getData());


                }else{
                    Toast.makeText(MyApp.getContext(), "Algo está muy mal", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Paquete> call, Throwable t) {
                Toast.makeText(MyApp.getContext(), "Error en la Conexión", Toast.LENGTH_SHORT).show();


            }
        });
        return data;
    }

    public LiveData<List<Datum>> getPaqueteInternetPrepago(){
        final MutableLiveData<List<Datum>> data = new MutableLiveData<>();

        Call<Paquete> call= authPaqueteService.getPaquetesInternetInal();
        call.enqueue(new Callback<Paquete>() {
            @Override
            public void onResponse(Call<Paquete> call, Response<Paquete> response) {
                if(response.isSuccessful()){
                    data.setValue(response.body().getData());


                }else{
                    Toast.makeText(MyApp.getContext(), "Algo está muy mal", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Paquete> call, Throwable t) {
                Toast.makeText(MyApp.getContext(), "Error en la Conexión", Toast.LENGTH_SHORT).show();


            }
        });
        return data;
    }



}

