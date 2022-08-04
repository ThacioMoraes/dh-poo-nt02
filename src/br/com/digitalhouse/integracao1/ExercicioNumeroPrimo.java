package br.com.digitalhouse.integracao1;

import java.util.Scanner;

public class ExercicioNumeroPrimo {

  static boolean ehDivisivel(int num1,int num2){
    if(num1 % num2 == 0) {
      return true;
    }
    return false;
  }

  static boolean ehPrimo(int num){
    int numderoDeDivisores = 0;
    for (int i = 1; i <= num; i++){
      if(ehDivisivel(num, i)){
        numderoDeDivisores ++;
      }
    }
    if(numderoDeDivisores != 2){
      return false;
    }
    return true;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num;

    System.out.println("Insira um número");
    num = sc.nextInt();

    boolean confirmaPrimo = ehPrimo(num);

    if(confirmaPrimo){
      System.out.println("O número é primo");
    } else{
      System.out.println("O número não é primo");
    }
  }

}
