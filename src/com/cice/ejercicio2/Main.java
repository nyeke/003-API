package com.cice.ejercicio2;

public class Main {

    public static void main(String[] args) {

        String[] array = {"Hoy","precisamente","es","dia","jueves"};

        int longuitudMaxima = 0;

        String larga = "";


        for (String a:array){

            if (a.length() > longuitudMaxima){
                longuitudMaxima = a.length();
                larga = a;
            }
        }

        System.out.println("La cadena mas larga es: " + larga);


    }
}
