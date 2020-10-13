package com.nere5.mascotasapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {

    ArrayList<Mascota> listaMascotas;
    RecyclerView recyclerMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaMascotas = new ArrayList<Mascota>();
        recyclerMascotas = (RecyclerView) findViewById(R.id.rcvMascotas);
        recyclerMascotas.setLayoutManager(new LinearLayoutManager(this));
        llenarMascotas();

        AdaptadorMascotas adapter = new AdaptadorMascotas(listaMascotas);
        recyclerMascotas.setAdapter(adapter);

    }

    private void llenarMascotas() {
        listaMascotas.add(new Mascota(R.drawable.mascota1, R.drawable.ic_like, "Rufo", "1", R.drawable.ic_num_likes));
        listaMascotas.add(new Mascota(R.drawable.mascota2, R.drawable.ic_like, "Danger", "2", R.drawable.ic_num_likes));
        listaMascotas.add(new Mascota(R.drawable.mascota3, R.drawable.ic_like, "Ginger", "3", R.drawable.ic_num_likes));
        listaMascotas.add(new Mascota(R.drawable.mascota4, R.drawable.ic_like, "Arnold", "4", R.drawable.ic_num_likes));
        listaMascotas.add(new Mascota(R.drawable.mascota5, R.drawable.ic_like, "Pepe", "5", R.drawable.ic_num_likes));

    }

}