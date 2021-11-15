package com.example.idnp_lab08;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>{
    private List<Ruta> mRutas;
    private LayoutInflater mInflater;
    private Context context;

    public ListAdapter(List<Ruta> itemList, Context context){
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mRutas = itemList;
    }

    @Override
    public int getItemCount(){
        return mRutas.size();
    }

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = mInflater.inflate(R.layout.list_rutas, null);
        return new ListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListAdapter.ViewHolder holder, final int position){
        holder.bindData(mRutas.get(position));
    }

    public void setItems(List<Ruta> items){
        mRutas = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView empresa,ruta,horario;

        ViewHolder(View itemView){
            super(itemView);
            iconImage = itemView.findViewById(R.id.iconImageView);
            empresa = itemView.findViewById(R.id.textEmpresa);
            ruta = itemView.findViewById(R.id.textRuta);
            horario = itemView.findViewById(R.id.textHorario);

        }

        void bindData(final Ruta item){
            empresa.setText(item.getEmpresa());
            ruta.setText(item.getLetraRuta());
            horario.setText(item.getHorario());
        }
    }
}
