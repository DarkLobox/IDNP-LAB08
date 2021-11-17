package com.example.idnp_lab08;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
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

         ListAdapter listAdapter = new ListAdapter(rutas, this, new ListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Ruta item) {
                moveToDescription(item);
            }
        });
        RecyclerView recyclerView = findViewById(R.id.recyclerRutas);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
    //Al acudir el método mostrará otra actividad, este pasa el objeto con todo,
    public void  moveToDescription(Ruta item){
        Intent inten =new Intent(this, DescripcionActivity.class);
        inten.putExtra("Ruta", item);
        startActivity(inten);
    }
}
