package com.company;

public class TicketElectronico {

    private String nombrePasajero;
    private int hora;
    private String dia;
    private char clase;
    private String origen;
    private String destino;

    public TicketElectronico() {
    }

    // Constructor
    public TicketElectronico (String nombre, int hora, String dia, char clase, String origen, String destino ){

        nombrePasajero = nombre;
        this.hora = hora;
        this.dia = dia;
        this.clase = clase;
        this.origen = origen;
        this.destino = destino;

    }

    // Metodos

    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public int getHora() {
        return hora;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "TicketElectronico{" +
                "nombrePasajero='" + nombrePasajero + '\'' +
                ", hora=" + hora +
                ", dia='" + dia + '\'' +
                ", clase=" + clase +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                '}';
    }
}
