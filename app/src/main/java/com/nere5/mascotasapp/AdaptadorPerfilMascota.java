package com.nere5.mascotasapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorPerfilMascota extends RecyclerView.Adapter<AdaptadorPerfilMascota.ViewHolderPerfilMascota> {

    ArrayList<Mascota> listaMascotas;

    public AdaptadorPerfilMascota(ArrayList<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    @NonNull
    @Override
    public AdaptadorPerfilMascota.ViewHolderPerfilMascota onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_perfil_mascota, parent, false);
        return new AdaptadorPerfilMascota.ViewHolderPerfilMascota(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorPerfilMascota.ViewHolderPerfilMascota holder, int position) {
        Mascota mascota = listaMascotas.get(position);
        holder.imvMascota.setImageResource(mascota.getFotoMascota());
        holder.txtNumLikes.setText(mascota.getNumLikes());
        holder.icNumlikes.setImageResource(mascota.getIcNumLikes());
    }

    @Override
    public int getItemCount() {
        return listaMascotas.size();
    }

    public static class ViewHolderPerfilMascota extends RecyclerView.ViewHolder {
        private ImageView imvMascota;
        private TextView txtNumLikes;
        private ImageView icNumlikes;

        public ViewHolderPerfilMascota(@NonNull View itemView) {
            super(itemView);
            imvMascota = (ImageView) itemView.findViewById(R.id.imvMascota);
            txtNumLikes = (TextView) itemView.findViewById(R.id.txtNumLikes);
            icNumlikes = (ImageView) itemView.findViewById(R.id.icNumLikes);
        }
    }
}
