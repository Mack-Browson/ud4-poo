package com.company;

public class Motor {

    private int cilindrada;
    private String combustible;
    private int potencia;

    // Constructor

    public Motor(int cilindrada, String combustible, int potencia) {
        this.cilindrada = cilindrada;
        this.combustible = combustible;
        this.potencia = potencia;
    }

    // Metodos de acceso
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    // Asociar el motor con la clase Coche
    Coche coche;

     //Metodos
    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }
}
