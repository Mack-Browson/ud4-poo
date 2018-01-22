package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        Cronometro[] c =new Cronometro[10];
        int i = 0;

        // Menu

        String  elegir;

        do {
            System.out.println ("\n" +
                    "  a)  Nuevo cronómetro\n" +
                    "  b) Consultar cronómetro\n" +
                    "  c)  Salir\n");

            elegir = br.readLine ();

            switch (elegir.toLowerCase ()){ // toLowerCase para convertir a minuscula

                case "a":
                    if( i<10)
                    c[i] = new Cronometro (); // Almacena por cada cronometro que que hay en la posicion del array
                    i++;

                    break;
                case "b":
                    System.out.println ( c[i]);


            }


        }while (!elegir.equalsIgnoreCase ("c"));
    }
}
