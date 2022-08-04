package br.com.digitalhouse.aula2;

import java.util.Scanner;

public class ExerciciosVariaveis {

    static boolean ehDivisivel(int num1,int num2){
        if(num1 % num2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int num1 = 6;
        int num2 = 3;

        if(num1 > num2){
            System.out.println("É maior");
        } else if (num2>num1){
            System.out.println("Não é maior!");
        } else{
            System.out.println("São iguais");
        }

        switch (num1){

            case 1:
                System.out.println("é o número 1");
                break;
            case 2:
                System.out.println("é o número 2");
                break;
            default:
                System.out.println("não conheço o número");
                break;
        }

        while(num1 < 5){
            System.out.println("ainda não é 5");
            num1 ++;
        }

        for(int i = 0; i <= 5; i++){
            System.out.println(i);
        }

        if(num1 % num2 == 0){
            System.out.println("É divisível");
        } else {
            System.out.println("Não é divisível");
        }

        String nome = "Thácio";

        System.out.println(nome.charAt(0));

        Integer numero1 = 10;
        Integer numero2 = 0;

        System.out.println(numero1.compareTo(numero2));

        System.out.println(ehDivisivel(20, 20));

    }
}
