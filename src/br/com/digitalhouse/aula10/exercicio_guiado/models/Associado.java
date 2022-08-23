package br.com.digitalhouse.aula10.exercicio_guiado.models;

public class Associado {

  private String numAssociado;
  private String nome;
  private double valorMensal;
  private String atividade;

  public Associado(String numAssociado, String nome, double valorMensal, String atividade) {
    this.numAssociado = numAssociado;
    this.nome = nome;
    this.valorMensal = valorMensal;
    this.atividade = atividade;
  }

  public double custoMensal(){
    return this.valorMensal;
  }

  public double getValorMensal() {
    return valorMensal;
  }
}
