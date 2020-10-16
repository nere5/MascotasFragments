package com.nere5.mascotasapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> listaMascotas;
    RecyclerView recyclerMascotas;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setUpViewPager();


       /* listaMascotas = new ArrayList<Mascota>();
        recyclerMascotas = (RecyclerView) findViewById(R.id.rcvMascotas);
        recyclerMascotas.setLayoutManager(new LinearLayoutManager(this));
        llenarMascotas();*/

        /*  AdaptadorMascotas adapter = new AdaptadorMascotas(listaMascotas);
        recyclerMascotas.setAdapter(adapter);*/

        if (toolbar != null){
            setSupportActionBar(toolbar);
        }

    }

    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new RecyclerViewFragment());
        fragments.add(new PerfilFragment());
        return fragments;
    }

    private void setUpViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);
    }

    private void llenarMascotas() {
        listaMascotas.add(new Mascota(R.drawable.mascota1, R.drawable.ic_like, "Rufo", "1", R.drawable.ic_num_likes));
        listaMascotas.add(new Mascota(R.drawable.mascota2, R.drawable.ic_like, "Danger", "2", R.drawable.ic_num_likes));
        listaMascotas.add(new Mascota(R.drawable.mascota3, R.drawable.ic_like, "Ginger", "3", R.drawable.ic_num_likes));
        listaMascotas.add(new Mascota(R.drawable.mascota4, R.drawable.ic_like, "Arnold", "4", R.drawable.ic_num_likes));
        listaMascotas.add(new Mascota(R.drawable.mascota5, R.drawable.ic_like, "Pepe", "5", R.drawable.ic_num_likes));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_view, menu);
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.atvFavoritos:
                Intent intent = new Intent(this, MascotasFavoritas.class);
                startActivity(intent);
                break;
            case R.id.Contacto:
                Intent i = new Intent(this, FormularioContacto.class);
                startActivity(i);
                break;
            case R.id.AcercaDe:
                Intent e = new Intent(this, Biografia.class);
                startActivity(e);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}

