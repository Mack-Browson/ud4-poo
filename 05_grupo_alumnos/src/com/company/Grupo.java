package com.company;

public class Grupo {

    private String codigo;

    Alumno[] alumnos = new Alumno[5]; // PARA QUE HAYA CONEXION ENTRE LA  clase GRUPO Y ALUMNI 1 A N



    public  void rellenarAlumnos (Alumno[] alumnos){

       for (int i=0; i<5; i++){

           alumnos[i] = new Alumno (" Miguel Bruno"," Obiang Mitogo Nchama"," Y3112476S"," 698417922 " );

       }
   }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getCodigo() {
        return codigo;
    }
}
