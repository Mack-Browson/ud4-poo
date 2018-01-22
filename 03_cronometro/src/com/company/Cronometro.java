package com.company;

public class Cronometro {

    private long horaInicio;


    public  Cronometro(){

        horaInicio  = System.nanoTime ();
    }

    public  long tiempoTranscurrido(){

        long estimatedTime = System.nanoTime() - horaInicio;
        return estimatedTime;
    }
}
