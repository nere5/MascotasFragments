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
 * Use the {@link RecyclerViewFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RecyclerViewFragment extends Fragment {

    ArrayList<Mascota> listaMascotas;
    RecyclerView recyclerMascotas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recycler_view, container, false);

        listaMascotas = new ArrayList<Mascota>();
        recyclerMascotas = (RecyclerView) view.findViewById(R.id.rcvMascotas);
        recyclerMascotas.setLayoutManager(new LinearLayoutManager(getActivity()));
        llenarMascotas();

        AdaptadorMascotas adapter = new AdaptadorMascotas(listaMascotas);
        recyclerMascotas.setAdapter(adapter);
        return view;
    }

    private void llenarMascotas() {
        listaMascotas.add(new Mascota(R.drawable.mascota1, R.drawable.ic_like, "Rufo",
                "1", R.drawable.ic_num_likes));
        listaMascotas.add(new Mascota(R.drawable.mascota2, R.drawable.ic_like, "Danger",
                "2", R.drawable.ic_num_likes));
        listaMascotas.add(new Mascota(R.drawable.mascota3, R.drawable.ic_like, "Ginger",
                "3", R.drawable.ic_num_likes));
        listaMascotas.add(new Mascota(R.drawable.mascota4, R.drawable.ic_like, "Arnold",
                "4", R.drawable.ic_num_likes));
        listaMascotas.add(new Mascota(R.drawable.mascota5, R.drawable.ic_like, "Pepe",
                "5", R.drawable.ic_num_likes));
    }
}