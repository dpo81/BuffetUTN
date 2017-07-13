package com.example.dpo.buffetutn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        List<Producto> productos = new ArrayList<Producto>();
        productos.add(new Producto("Empanada", 15.00));
        productos.add(new Producto("Alfajor", 7.50));
        productos.add(new Producto("Café", 26.75));

        RecyclerView list = (RecyclerView) findViewById(R.id.list);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        list.setLayoutManager(layoutManager);

        ListaProductosAdapter adapter = new ListaProductosAdapter(productos);
        list.setAdapter(adapter);
    }
}
