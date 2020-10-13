package com.nere5.mascotasapp;

public class Mascota {
    private int fotoMascota;
    private int icLike;
    private String nombreMascota;
    private String numLikes;
    private int icNumLikes;

    public Mascota(int fotoMascota, int icLike, String nombreMascota, String numLikes, int icNumLikes) {
        this.fotoMascota = fotoMascota;
        this.icLike = icLike;
        this.nombreMascota = nombreMascota;
        this.numLikes = numLikes;
        this.icNumLikes = icNumLikes;
    }

    public int getFotoMascota() {
        return fotoMascota;
    }

    public void setFotoMascota(int fotoMascota) {
        this.fotoMascota = fotoMascota;
    }

    public int getIcLike() {
        return icLike;
    }

    public void setIcLike(int icLike) {
        this.icLike = icLike;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getNumLikes() {
        return numLikes;
    }

    public void setNumLikes(String numLikes) {
        this.numLikes = numLikes;
    }

    public int getIcNumLikes() {
        return icNumLikes;
    }

    public void setIcNumLikes(int icNumLikes) {
        this.icNumLikes = icNumLikes;
    }
}
