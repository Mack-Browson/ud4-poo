package com.company;

import org.omg.PortableInterceptor.INACTIVE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        Coche coche = new Coche();

        // Recoger datos
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        //Nuestro coche cuantos motores, segun lo que ponga el usuario
        System.out.print(" Motores :");
        int numeroMotor = Integer.parseInt(leer.readLine());
        for (int i=0; i<numeroMotor;i++){

            System.out.print( " Cilindrada : ");
            int cilindrada = Integer.parseInt(leer.readLine());
            System.out.print(" Combustible : ");
            String combustible = leer.readLine();
            System.out.println(" Potencia : ");
            int potencia = Integer.parseInt(leer.readLine());

            coche.getMotors()[i] = new Motor(cilindrada,combustible,potencia);
        }

        // bucle para las cuatro ruedas que dispone el coche
        for (int i=0; i<4; i++){

            coche.getRuedas()[i] = new Rueda();
            coche.getRuedas()[i].setCoche(coche);
        }
  // comprobar el intervalo del  numero de puertas con el bucle do while
        int numeroPuertas;
        do {

            System.out.print("El numero de puertas está entre: ");
            numeroPuertas = Integer.parseInt(leer.readLine());

        } while (!(numeroPuertas >= 2 && numeroPuertas <= 5));

        for (int i = 0; i < numeroPuertas; i++) {
            coche.getPuertas()[i] = new Puertas();
            coche.getPuertas()[i].setCoche(coche);
        }

    }
}
