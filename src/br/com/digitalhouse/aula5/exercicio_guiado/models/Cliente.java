package br.com.digitalhouse.aula5.exercicio_guiado.models;

public class Cliente {

  private String nome;
  private int numeroCliente;
  private double divida;

  public Cliente(String nome, int numeroCliente) {
    this.nome = nome;
    this.numeroCliente = numeroCliente;
    this.divida = 0;
  }

  public void aumentarDivida(double valor){
    this.divida += valor;
  }

  public void pagarDivida(double valor){
    if(this.divida - valor >= 0){
      this.divida -= valor;
    }
  }

  public String getNome() {
    return nome;
  }

  public int getNumeroCliente() {
    return numeroCliente;
  }

  public double getDivida() {
    return divida;
  }
}
