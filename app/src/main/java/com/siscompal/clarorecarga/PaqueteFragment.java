package com.siscompal.clarorecarga;

import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.ListFragment;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.siscompal.clarorecarga.common.Constantes;
import com.siscompal.clarorecarga.ui.DashboardActivity;
import com.siscompal.clarorecarga.ui.RealizaPaquete;

public class PaqueteFragment extends Fragment implements View.OnClickListener {
    Button btnVoz, btnInternet, btnChat, btnApps, btnTodo, btnTv, btnInterP, btnLargaDistancia, btnMinuteros;

    private PaqueteViewModel mViewModel;



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
       View v =inflater.inflate(R.layout.tipos_paquete_fragment, container, false);


        btnVoz=v.findViewById(R.id.buttonVoz);
        btnChat=v.findViewById(R.id.buttonChat);
        btnInternet=v.findViewById(R.id.buttonInternet);
        btnTodo=v.findViewById(R.id.buttonTodoInc);
        btnApps=v.findViewById(R.id.buttonApps);
        btnTv=v.findViewById(R.id.buttonTv);
        btnInterP=v.findViewById(R.id.buttonInter);
        btnLargaDistancia=v.findViewById(R.id.buttonLargaDistancia);
        btnMinuteros=v.findViewById(R.id.buttonMinutero);
        btnTv=v.findViewById(R.id.buttonTv);

        events();




                return v;
    }

    private void events() {
        btnVoz.setOnClickListener(this);
        btnInterP.setOnClickListener(this);
        btnChat.setOnClickListener(this);
        btnTodo.setOnClickListener(this);
        btnApps.setOnClickListener(this);
        btnTv.setOnClickListener(this);
        btnInternet.setOnClickListener(this);
        btnLargaDistancia.setOnClickListener(this);
        btnMinuteros.setOnClickListener(this);
        btnTv.setOnClickListener(this);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(PaqueteViewModel.class);
        // TODO: Use the ViewModel


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }



    @Override
    public void onClick(View view) {
        int boton = view.getId();
        switch (boton){
            case R.id.buttonVoz:
                insertNestedFragmentVoz();
                break;
            case R.id.buttonInternet:
                insertNestedFragmentInt();
                break;
            case R.id.buttonTodoInc:
                insertNestedFragmentTodoIn();
                break;
            case R.id.buttonChat:
                insertNestedFragmentChat();
                break;
            case R.id.buttonApps:
                insertNestedFragmentApps();
                break;
            case R.id.buttonLargaDistancia:
                insertNestedFragmentLargaDistancia();
                break;
            case R.id.buttonMinutero:
                insertNestedFragmentMinutero();
                break;
            case R.id.buttonTv:
                insertNestedFragmentTv();
                break;
            case R.id.buttonInter:
                insertNestedFragmetInternetPre();
                break;

        }


    }

    private void insertNestedFragmetInternetPre() {

        Fragment childFragment =  PaqueteListFragment.newInstance(Constantes.PAQUETES_INTERNET_PREPAGO);
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.frInterIna, childFragment).commit();
    }


    private void insertNestedFragmentTv() {
        Fragment childFragment =  PaqueteListFragment.newInstance(Constantes.PAQUETES_TELEVISION_PREPAGO);
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.frTv, childFragment).commit();
    }

    private void insertNestedFragmentMinutero() {
        Fragment childFragment =  PaqueteListFragment.newInstance(Constantes.PAQUETES_MINUTERO);
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.frMinuteors, childFragment).commit();
    }

    private void insertNestedFragmentLargaDistancia() {
        Fragment childFragment =  PaqueteListFragment.newInstance(Constantes.PAQUETES_LARGA_DISTANCIA);
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.frLargaDistancia, childFragment).commit();
    }

    private void insertNestedFragmentApps() {
        Fragment childFragment =  PaqueteListFragment.newInstance(Constantes.PAQUETES_APPS);
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.frApps, childFragment).commit();
    }

    private void insertNestedFragmentChat() {
        Fragment childFragment =  PaqueteListFragment.newInstance(Constantes.PAQUETES_CHAT);
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.frChat, childFragment).commit();
    }

    private void insertNestedFragmentTodoIn() {
        Fragment childFragment =  PaqueteListFragment.newInstance(Constantes.PAQUETES_TODO_INCLUIDO);
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.frTodoIncl, childFragment).commit();
    }

    private void insertNestedFragmentVoz() {
        Fragment childFragment =  PaqueteListFragment.newInstance(Constantes.PAQUETES_VOZ);
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.frContenedor, childFragment).commit();
    }
    private void insertNestedFragmentInt() {
        Fragment childFragment =  PaqueteListFragment.newInstance(Constantes.PAQUETES_INTERNET);
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.frContenedorInter, childFragment).commit();
    }
}
