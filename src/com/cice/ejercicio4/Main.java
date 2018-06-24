package com.cice.ejercicio4;

public class Main {
    public static void main(String[] args) {
        int num1 = (int)Math.floor(Math.random()*98+1);
        int num2 = (int)Math.floor(Math.random()*98+1);
        int suma = 0;

        if(num1<num2){
            for (int i = num1+1; i < num2; i++){
                suma += i;
            }
        } else {
            for (int i = num2+1; i < num1; i++){
                suma += i;
            }
        }

        System.out.println("El primer numero aleatorio es " +num1);
        System.out.println("El segundo numero aleatorio es " +num2);
        System.out.println("--------------------------------------");
        System.out.println("La suma de los intermedios es " +suma);
    }

}
