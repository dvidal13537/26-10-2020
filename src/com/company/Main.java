package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Condicionales
        System.out.println("Introduce el numero que quieras: ");
        Scanner a = new Scanner(System.in);

        int num = a.nextInt();
        int b = num;

        if (b == 0) {
            System.out.println("----Esto no es ni positivo ni negativo----");
        }
        if (b > 0){
            System.out.println("----El numero que ha introducido es positivo----");
        }
        if (b < 0){
            System.out.println("----El numero introducido es negativo----");
        }

        System.out.println("Introduce un numero para saber si es multiple de 2.");
        Scanner numero = new Scanner(System.in);
        int num2 = numero.nextInt();
        int multiplo = 2;


        if ((num2 % multiplo) == 0) {

            System.out.printf("%d es multiple de %d", numero , multiplo);

        } else {System.out.println("No es multiplo de 2.");}

    }
}