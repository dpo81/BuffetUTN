package com.example.dpo.buffetutn;

/**
 * Created by DPO on 12/7/2017.
 */


import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ListaProductosAdapter extends Adapter<ProductoViewHolder> {
    private List<Producto> lista;

    public ListaProductosAdapter(List<Producto> lista) {
        this.lista = lista;
    }

    @Override
    public ProductoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu, parent, false);
        ProductoViewHolder productoViewHolder = new ProductoViewHolder(v);
        return productoViewHolder;
    }

    @Override
    public void onBindViewHolder(ProductoViewHolder holder, int position) {

        Producto p = lista.get(position);

        holder.nombre.setText(p.getNombre());
        holder.precio.setText(p.getPrecio().toString());
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}