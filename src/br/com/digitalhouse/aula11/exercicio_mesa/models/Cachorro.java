package br.com.digitalhouse.aula11.exercicio_mesa.models;

public class Cachorro extends Animal{

  public Cachorro(String nome, int idade) {
    super(nome, idade);
  }

  @Override
  public void emitirSom(){
    System.out.println("Au!");
  }

  @Override
  public void movimentar(){
    System.out.println("Correndo como cachorro!");
  }
}
