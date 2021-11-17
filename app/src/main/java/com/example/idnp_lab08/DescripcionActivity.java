package com.example.idnp_lab08;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class DescripcionActivity extends AppCompatActivity {
    TextView titleDescriptiont;
    TextView letraDescriptiont;
    TextView horarioDescriptiont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);

        Ruta ruta= (Ruta) getIntent().getSerializableExtra("Ruta");
        titleDescriptiont =findViewById(R.id.titleDescription);
        letraDescriptiont=findViewById(R.id.letraRutaDescription);
        horarioDescriptiont =findViewById(R.id.horarioDescription);

        titleDescriptiont.setText(ruta.getEmpresa());
        letraDescriptiont.setText(ruta.getLetraRuta());
        horarioDescriptiont.setText(ruta.getHorario());
    }
}