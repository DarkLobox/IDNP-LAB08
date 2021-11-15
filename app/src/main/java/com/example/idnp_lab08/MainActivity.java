package com.example.idnp_lab08;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Ruta> rutas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init(){
        rutas = new ArrayList<Ruta>();
        rutas.add(new Ruta("3 de Octubre", "A", "5:00 AM - 9:00 PM"));
        rutas.add(new Ruta("3 de Octubre", "B", "5:00 AM - 9:00 PM"));
        rutas.add(new Ruta("3 de Octubre", "D", "5:00 AM - 9:00 PM"));
        rutas.add(new Ruta("3 de Octubre", "A", "5:00 AM - 9:00 PM"));
        rutas.add(new Ruta("3 de Octubre", "B", "5:00 AM - 9:00 PM"));
        rutas.add(new Ruta("3 de Octubre", "D", "5:00 AM - 9:00 PM"));

        ListAdapter listAdapter = new ListAdapter(rutas, this);
        RecyclerView recyclerView = findViewById(R.id.recyclerRutas);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}