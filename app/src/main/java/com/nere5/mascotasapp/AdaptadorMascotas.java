package com.nere5.mascotasapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorMascotas extends RecyclerView.Adapter<AdaptadorMascotas.ViewHolderMascotas> {

    ArrayList<Mascota> listaMascotas;

    public AdaptadorMascotas(ArrayList<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    @NonNull
    @Override
    public ViewHolderMascotas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas, parent, false);
        return new ViewHolderMascotas(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderMascotas holder, int position) {
        Mascota mascota = listaMascotas.get(position);
        holder.imvMascota.setImageResource(mascota.getFotoMascota());
        holder.icLike.setImageResource(mascota.getIcLike());
        holder.txtNombreMascota.setText(mascota.getNombreMascota());
        holder.txtNumLikes.setText(mascota.getNumLikes());
        holder.icNumlikes.setImageResource(mascota.getIcNumLikes());

    }

    @Override
    public int getItemCount() {
        return listaMascotas.size();
    }

    public static class ViewHolderMascotas extends RecyclerView.ViewHolder {
        private ImageView imvMascota;
        private ImageView icLike;
        private TextView txtNombreMascota;
        private TextView txtNumLikes;
        private ImageView icNumlikes;

        public ViewHolderMascotas(@NonNull View itemView) {
            super(itemView);
            imvMascota = (ImageView) itemView.findViewById(R.id.imvMascota);
            icLike = (ImageView) itemView.findViewById(R.id.icLike);
            txtNombreMascota = (TextView) itemView.findViewById(R.id.txtNombreMascota);
            txtNumLikes = (TextView) itemView.findViewById(R.id.txtNumLikes);
            icNumlikes = (ImageView) itemView.findViewById(R.id.icNumLikes);
        }
    }
}
