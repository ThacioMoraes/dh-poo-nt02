package br.com.digitalhouse.aula11.exercicio_mesa.models;

public class Cavalo extends Animal{

  public Cavalo(String nome, int idade) {
    super(nome, idade);
  }

  @Override
  public void emitirSom(){
    System.out.println("Iiirrrrí!");
  }

  @Override
  public void movimentar(){
    System.out.println("Correndo como cavalo!");
  }
}
