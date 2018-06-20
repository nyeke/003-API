package com.cice;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Separar cadenas

        String cad = "cadena;de;caracteres;de;ejemplo";

        String[] palabras = cad.split(";");

        for (String s:palabras){
            System.out.println(s);
        }

        // Mismo resultado

        Arrays.stream(palabras).forEach(p-> System.out.println(p));

        // Reemplazar caracteres

        System.out.println(cad.replace("e","i"));

    }
}
