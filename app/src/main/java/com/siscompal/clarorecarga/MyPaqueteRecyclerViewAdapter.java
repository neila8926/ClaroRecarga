package com.siscompal.clarorecarga;

import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.siscompal.clarorecarga.retrofit.response.Datum;

import java.util.List;


public class MyPaqueteRecyclerViewAdapter extends RecyclerView.Adapter<MyPaqueteRecyclerViewAdapter.ViewHolder> {

    private Context ctx;
    private  List<Datum> mValues;

    public MyPaqueteRecyclerViewAdapter(Context contexto, List<Datum> items) {
        mValues = items;
        ctx = contexto;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_paquete, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        if(mValues!=null){
        holder.mItem = mValues.get(position);

        holder.tvNombrePaq.setText(holder.mItem.getName());
        holder.tvDescripcion.setText(holder.mItem.getDescripcion());
        holder.tvValor.setText(holder.mItem.getPrecio().toString());


    }}
    public void setData(List<Datum> paqueteList){

        this.mValues=paqueteList;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if(mValues != null)
            return mValues.size();
        else return 0;

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView tvNombrePaq;
        public final TextView tvDescripcion;
        public final TextView tvValor;
        public Datum mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            tvNombrePaq = (TextView) view.findViewById(R.id.textViewNombrePaq);
            tvDescripcion = (TextView) view.findViewById(R.id.textViewDescripcion);
            tvValor=(TextView) view.findViewById(R.id.textViewValor);

        }

        @Override
        public String toString() {
            return super.toString() + " '" + tvNombrePaq.getText() + "'";
        }
    }
}
