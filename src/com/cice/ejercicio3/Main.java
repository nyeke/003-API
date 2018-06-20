package com.cice.ejercicio3;

public class Main {

    public static void main(String[] args) {

        // Con String

        String texto = "Texto donde se insertaran espacios";

        texto = texto.replace(" ", "/ ");

        System.out.println(texto.toString());

        // Con String builder

        int pos = 0;

        StringBuilder textoFinal =  new StringBuilder("Texto donde se insertaran espacios");

        while((pos = textoFinal.indexOf(" ", pos)) > 0 ){
            textoFinal.insert(pos, "/");
            pos+=2;
        }

        System.out.println(textoFinal.toString());

        // Paja mental

        texto = "Texto donde se insertaran espacios";

        StringBuilder texto2 =  new StringBuilder(texto.replace(" ","/ ").toString());

        System.out.println(texto2);
    }
}
