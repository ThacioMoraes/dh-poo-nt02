package br.com.digitalhouse.aula11.exercicio_mesa.models;

public class Preguica extends Animal{

  public Preguica(String nome, int idade) {
    super(nome, idade);
  }

  @Override
  public void emitirSom(){
    System.out.println("Preguiça faz som?");
  }

  @Override
  public void movimentar(){
    System.out.println("Subindo a árvore!");
  }
}
