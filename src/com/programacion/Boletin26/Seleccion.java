package com.programacion.Boletin26;

public abstract class Seleccion {


    private int id;
    private String nome;
    private String apelidos;
    private int edad;

    public Seleccion() {
    }

    public Seleccion(int id, String nome, String apelidos, int edad) {
        this.id = id;
        this.nome = nome;
        this.apelidos = apelidos;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nome=" + nome + ", apelidos=" + apelidos + ", edad=" + edad;
    }

}
