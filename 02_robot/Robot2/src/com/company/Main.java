package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Robot robot=new Robot();

        do {
            System.out.println(" Coordenada x : ");
            int x=Integer.parseInt(br.readLine());

            System.out.println(" Coordenada y : ");
            int y=Integer.parseInt(br.readLine());
            robot.mover(x,y);
        }while (true);

    }
}
