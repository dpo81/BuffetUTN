package com.example.dpo.buffetutn;

/**
 * Created by DPO on 12/7/2017.
 */

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ProductoViewHolder extends RecyclerView.ViewHolder {

    TextView nombre;
    TextView precio;

    public ProductoViewHolder(View itemView) {
        super(itemView);
        nombre = (TextView) itemView.findViewById(R.id.nombre);
        precio = (TextView) itemView.findViewById(R.id.precio);
    }


}