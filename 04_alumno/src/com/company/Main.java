package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    Alumno[] alumnos = new Alumno[5];

  // Rellenar el array alumnos

        for (int i=0; i<5; i++){
            alumnos[i] =new Alumno();

            System.out.print (" Nombre : ");
            alumnos[i].setNombre (br.readLine ());
            System.out.print ("Apellido :");
            alumnos[i].setApellido (br.readLine ());
            System.out.print (" DNI : ");
            alumnos[i].setDni (br.readLine ());
            System.out.print (" Telefono : ");
            alumnos[i].setTelefono (br.readLine ());

        }

        // Mostrar los datos introducidos

        for (int i=0; i<5; i++){

            System.out.println ( " Lista de alumnos : ");
            System.out.println ();
            System.out.println (" Nombre : "+ alumnos[i].getNombre ());
            System.out.println (" Apellido : "+ alumnos[i].getApellido ());
            System.out.println (" DNI : "+alumnos[i].getDni ());
            System.out.println (" Telefono : "+alumnos[i].getTelefono ());
        }
    }
}
