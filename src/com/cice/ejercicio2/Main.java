package com.cice.ejercicio2;

public class Main {

    public static void main(String[] args) {

        String[] array = {"Hoy","es","dia","jueves"};

        int longuitudMaxima = 0;
        int longuitud;
        int mayor;
        String larga = "";


        for (String a:array){
            longuitud = a.length();
            if (longuitud > longuitudMaxima){
                longuitudMaxima = longuitud;
                larga = a;
            }
        }

        System.out.println("La cadena mas larga es: " + larga);


    }
}
