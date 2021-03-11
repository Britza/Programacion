package com.programacion.Boletin17;

public class Libreria {

    private String titulo;
    private String autor;
    private String ISBN;
    private float prezo;
    private int numUni;

    public Libreria() {
    }

    public Libreria(String titulo, String autor, String ISBN, float prezo, int numUni) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.numUni = numUni;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getNumUni() {
        return numUni;
    }

    public void setNumUni(int numUni) {
        this.numUni = numUni;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", prezo=" + prezo + ", numUni=" + numUni;
    }


}
