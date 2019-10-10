package com.siscompal.clarorecarga;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.siscompal.clarorecarga.common.Constantes;
import com.siscompal.clarorecarga.data.PaqueteViewModel;
import com.siscompal.clarorecarga.retrofit.response.Datum;
import java.util.List;




public class PaqueteListFragment extends Fragment {



    private int paqueteType = 1;
    RecyclerView recyclerView;
    MyPaqueteRecyclerViewAdapter adapter;
    List<Datum>paqueteList;
    PaqueteViewModel paqueteViewModel;




    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public PaqueteListFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static PaqueteListFragment newInstance(int paqueteType) {
        PaqueteListFragment fragment = new PaqueteListFragment();
        Bundle args = new Bundle();
        args.putInt(Constantes.PAQUETES_TYPE, paqueteType);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            paqueteType = getArguments().getInt(Constantes.PAQUETES_TYPE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        paqueteViewModel= ViewModelProviders.of(getActivity())
                .get(PaqueteViewModel.class);
        View view = inflater.inflate(R.layout.fragment_paquete_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            recyclerView = (RecyclerView) view;

                recyclerView.setLayoutManager(new LinearLayoutManager(context));


            adapter = new MyPaqueteRecyclerViewAdapter(
                    getActivity(),
                    paqueteList);
            recyclerView.setAdapter(adapter);

            if(paqueteType==Constantes.PAQUETES_VOZ) {
                loadPaqueteVoz();
            }else if(paqueteType==Constantes.PAQUETES_INTERNET) {
                loadPaqueteInternet();
            }else if(paqueteType==Constantes.PAQUETES_TODO_INCLUIDO) {
                loadPaqueteTodoIncluido();
            }else if(paqueteType==Constantes.PAQUETES_CHAT) {
                loadPaqueteChat();
            }
            else if(paqueteType==Constantes.PAQUETES_APPS) {
                loadPaqueteApps();
            }
            else if(paqueteType==Constantes.PAQUETES_LARGA_DISTANCIA) {
                loadPaqueteLargaDistancia();
            }
            else if(paqueteType==Constantes.PAQUETES_MINUTERO) {
                loadPaqueteMinutero();
            }
            else if(paqueteType==Constantes.PAQUETES_TELEVISION_PREPAGO) {
                loadPaqueteTv();
            }
            else if(paqueteType==Constantes.PAQUETES_INTERNET_PREPAGO) {
                loadPaqueteInternetPre();
            }
        }
        return view;
    }

    private void loadPaqueteInternetPre() {
        paqueteViewModel.getPaqueteInternetPrepago().observe(getActivity(), new Observer<List<Datum>>() {
            @Override
            public void onChanged(List<Datum> data) {
                paqueteList = data;
                adapter.setData(paqueteList);

            }
        });
    }

    private void loadPaqueteTv() {
        paqueteViewModel.getPaqueteTv().observe(getActivity(), new Observer<List<Datum>>() {
            @Override
            public void onChanged(List<Datum> data) {
                paqueteList = data;
                adapter.setData(paqueteList);

            }
        });
    }

    private void loadPaqueteMinutero() {
        paqueteViewModel.getPaqueteMinutero().observe(getActivity(), new Observer<List<Datum>>() {
            @Override
            public void onChanged(List<Datum> data) {
                paqueteList = data;
                adapter.setData(paqueteList);

            }
        });
    }

    private void loadPaqueteLargaDistancia() {
        paqueteViewModel.getPaquetesLargaDistancia().observe(getActivity(), new Observer<List<Datum>>() {
            @Override
            public void onChanged(List<Datum> data) {
                paqueteList = data;
                adapter.setData(paqueteList);

            }
        });
    }

    private void loadPaqueteApps() {
        paqueteViewModel.getPaquetesApps().observe(getActivity(), new Observer<List<Datum>>() {
            @Override
            public void onChanged(List<Datum> data) {
                paqueteList = data;
                adapter.setData(paqueteList);

            }
        });
    }

    private void loadPaqueteChat() {
        paqueteViewModel.getPaquetesChat().observe(getActivity(), new Observer<List<Datum>>() {
            @Override
            public void onChanged(List<Datum> data) {
                paqueteList = data;
                adapter.setData(paqueteList);

            }
        });
    }

    private void loadPaqueteTodoIncluido() {
        paqueteViewModel.getPaquetesTodoIncluido().observe(getActivity(), new Observer<List<Datum>>() {
            @Override
            public void onChanged(List<Datum> data) {
                paqueteList = data;
                adapter.setData(paqueteList);

            }
        });
    }

    private void loadPaqueteInternet() {

        paqueteViewModel.getPaquetesInternet().observe(getActivity(), new Observer<List<Datum>>() {
            @Override
            public void onChanged(List<Datum> data) {
                paqueteList = data;
                adapter.setData(paqueteList);

            }
        });


    }


    private void loadPaqueteVoz() {

        paqueteViewModel.getPaquetesVoz().observe(getActivity(), new Observer<List<Datum>>() {
            @Override
            public void onChanged(List<Datum> data) {
                paqueteList = data;
                adapter.setData(paqueteList);

            }
        });




    }

}
