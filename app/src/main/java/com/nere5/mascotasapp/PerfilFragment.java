package com.nere5.mascotasapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PerfilFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PerfilFragment extends Fragment {

    ArrayList<Mascota> listaMascotas;
    RecyclerView recyclerMascotas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_perfil, container, false);

        listaMascotas = new ArrayList<Mascota>();
        recyclerMascotas = (RecyclerView) view.findViewById(R.id.rcvMascotas);
        recyclerMascotas.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        llenarMascotas();

        AdaptadorPerfilMascota adapter = new AdaptadorPerfilMascota(listaMascotas);
        recyclerMascotas.setAdapter(adapter);
        return view;
    }

    private void llenarMascotas() {
        listaMascotas.add(new Mascota(R.drawable.mascota1, "3", R.drawable.ic_num_likes));
        listaMascotas.add(new Mascota(R.drawable.mascota1, "6", R.drawable.ic_num_likes));
        listaMascotas.add(new Mascota(R.drawable.mascota1, "2", R.drawable.ic_num_likes));
        listaMascotas.add(new Mascota(R.drawable.mascota1, "4", R.drawable.ic_num_likes));
        listaMascotas.add(new Mascota(R.drawable.mascota1, "1", R.drawable.ic_num_likes));
        listaMascotas.add(new Mascota(R.drawable.mascota1, "5", R.drawable.ic_num_likes));
        listaMascotas.add(new Mascota(R.drawable.mascota1, "3", R.drawable.ic_num_likes));
        listaMascotas.add(new Mascota(R.drawable.mascota1, "7", R.drawable.ic_num_likes));
        listaMascotas.add(new Mascota(R.drawable.mascota1, "2", R.drawable.ic_num_likes));
    }
}