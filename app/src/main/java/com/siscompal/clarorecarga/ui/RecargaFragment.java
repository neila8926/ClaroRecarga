package com.siscompal.clarorecarga.ui;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.siscompal.clarorecarga.R;
import com.siscompal.clarorecarga.RecargaViewModel;

public class RecargaFragment extends Fragment {

    private RecargaViewModel mViewModel;

    public static RecargaFragment newInstance() {
        return new RecargaFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.recarga_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(RecargaViewModel.class);
        // TODO: Use the ViewModel
    }

}
