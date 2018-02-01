package com.company;

public class Rueda {

    private  String diametro;

    // Metodo de acceso

    public String getDiametro() {
        return diametro;
    }

    public void setDiametro(String diametro) {
        this.diametro = diametro;
    }

    // Asociar la rueda con la clase Coche
    Coche coche;

    //Metodos
    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }
}
