package com.example.prueba.adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.prueba.R;
import com.example.prueba.datos.DataImagenes;

public class AdaptadorDeImagenes extends BaseAdapter {
    private Context context;

    public AdaptadorDeImagenes(Context context){
        this.context = context;
    }

    @Override
    public int getCount(){
        return DataImagenes.ITEMS.length;
    }

    @Override
    public DataImagenes getItem(int position){
        return DataImagenes.ITEMS[position];
    }

    @Override
    public long getItemId(int position){
        return getItem(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup){
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.grid_item, viewGroup, false);
        }

        ImageView imgPersonas = (ImageView) view.findViewById(R.id.imagen_persona);
        TextView txtNombrePersonas = (TextView) view.findViewById(R.id.nombre_persona);

        final DataImagenes item = getItem(position);
        Glide.with(imgPersonas.getContext())
                .load(item.getIdDrawable())
                .into(imgPersonas);
        //imgPersonas.setImageResource(item.getIdDrawable());
        txtNombrePersonas.setText(item.getNombre());
        return view;
    }

}
