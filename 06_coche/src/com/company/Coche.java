package com.company;

public class Coche {

    private String marca;
    private String modelo;
    private int color;


    // Metodos de acceso
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    // Asociar al coche con las diferentes clases

    Motor[] motors = new Motor[8];
    Rueda[] ruedas = new Rueda[4];
    Puertas[] puertas = new Puertas[5];

    // metodos para los arreglos


    public Motor[] getMotors() {
        return motors;
    }

    public void setMotors(Motor[] motors) {
        this.motors = motors;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Puertas[] getPuertas() {
        return puertas;
    }

    public void setPuertas(Puertas[] puertas) {
        this.puertas = puertas;
    }
}
