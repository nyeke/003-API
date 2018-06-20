package com.cice.ejercicio1;

public class Main {

    String[] vocales = {"a","e","i","o","u"};

    public static void main(String[] args) {

        String cadena = "Esto es una cadena con muchas vocales";
        int numVocales = 0;

        for(int i = 0; i < cadena.length(); i++){
            switch (cadena.toLowerCase().charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    numVocales++;
                    break;
                default:
                    continue;
            }
        }

        System.out.println("El numero de vocales es: " + numVocales);

    }
}
