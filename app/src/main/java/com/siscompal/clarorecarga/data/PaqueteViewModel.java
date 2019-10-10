package com.siscompal.clarorecarga.data;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.siscompal.clarorecarga.retrofit.response.Datum;

import java.util.List;


public class PaqueteViewModel extends AndroidViewModel {

    private PaqueteRepository paqueteRepository;
    LiveData<List<Datum>> paquetesVoz;
    LiveData<List<Datum>> paquetesInternet;
    LiveData<List<Datum>> paquetesTodoIncluido;
    LiveData<List<Datum>> paquetesChat;
    LiveData<List<Datum>> paquetesApps;
    LiveData<List<Datum>> paquetesLargaDistancia;
    LiveData<List<Datum>> paqueteMinutero;
    LiveData<List<Datum>> paqueteTv;
    LiveData<List<Datum>> paqueteInternetPrepago;


    public PaqueteViewModel(@NonNull Application application) {
        super(application);

        paqueteRepository = new PaqueteRepository();
        paquetesVoz =paqueteRepository.getPaquetesVoz();
        paquetesInternet =paqueteRepository.getPaquetesInternet();
        paquetesTodoIncluido=paqueteRepository.getPaquetesTodoIncluido();
        paquetesChat=paqueteRepository.getPaquetesChat();
        paquetesApps=paqueteRepository.getPaquetesApps();
        paquetesLargaDistancia=paqueteRepository.getPaquetesLargaDistancia();
        paqueteMinutero=paqueteRepository.getPaqueteMinutero();
        paqueteTv=paqueteRepository.getPaqueteTv();
        paqueteInternetPrepago=paqueteRepository.getPaqueteInternetPrepago();


    }
    public LiveData<List<Datum>> getPaquetesVoz(){
        return paquetesVoz;
    }
    public LiveData<List<Datum>> getPaquetesInternet(){
        return paquetesInternet;
    }
    public LiveData<List<Datum>> getPaquetesTodoIncluido(){
        return paquetesTodoIncluido;
    }
    public LiveData<List<Datum>> getPaquetesChat(){ return paquetesChat; }
    public LiveData<List<Datum>> getPaquetesApps(){ return paquetesApps; }
    public LiveData<List<Datum>> getPaquetesLargaDistancia(){return  paquetesLargaDistancia;}
    public LiveData<List<Datum>> getPaqueteMinutero(){return paqueteMinutero;}
    public LiveData<List<Datum>> getPaqueteTv(){return paqueteTv;}
    public LiveData<List<Datum>> getPaqueteInternetPrepago(){return paqueteInternetPrepago;}


}
