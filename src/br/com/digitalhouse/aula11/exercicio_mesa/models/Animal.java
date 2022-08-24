package br.com.digitalhouse.aula11.exercicio_mesa.models;

public abstract class Animal {

  public Animal(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  private String nome;
  private int idade;

  public abstract void emitirSom();
  public abstract void movimentar();

}
