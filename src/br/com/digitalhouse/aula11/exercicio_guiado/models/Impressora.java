package br.com.digitalhouse.aula11.exercicio_guiado.models;

import java.util.Date;

public abstract class Impressora {

  private String modelo;
  private String tipoConexao;
  private Date dataFabricacao;
  private int folhasDisponiveis;
  private double porcentagemTinta;

  public Impressora(String modelo, String tipoConexao, int folhasDisponiveis,
      double porcentagemTinta) {
    this.modelo = modelo;
    this.tipoConexao = tipoConexao;
    this.folhasDisponiveis = folhasDisponiveis;
    this.porcentagemTinta = porcentagemTinta;
    this.dataFabricacao = new Date();
  }

  public boolean temPapel(){
    if(this.folhasDisponiveis > 0){
      return true;
    }
    return false;
  }

  public boolean precisaTinta(){
    if(this.porcentagemTinta == 0){
      return true;
    }
    return false;
  }

  public abstract String imprimir();

  public void setFolhasDisponiveis(int folhasDisponiveis) {
    this.folhasDisponiveis = folhasDisponiveis;
  }

  public void setPorcentagemTinta(double porcentagemTinta) {
    this.porcentagemTinta = porcentagemTinta;
  }

  public int getFolhasDisponiveis() {
    return folhasDisponiveis;
  }

  public double getPorcentagemTinta() {
    return porcentagemTinta;
  }
}
