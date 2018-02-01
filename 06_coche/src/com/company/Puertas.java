package com.company;

public class Puertas {

    private boolean elevaLunasElectricas;

    // Metodos de acceso
    public boolean isElevaLunasElectricas() {
        return elevaLunasElectricas;
    }

    public void setElevaLunasElectricas(boolean elevaLunasElectricas) {
        this.elevaLunasElectricas = elevaLunasElectricas;
    }

    // Asociar la puerta con la clase Coche
    Coche coche;

    //Metodos
    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }
}
