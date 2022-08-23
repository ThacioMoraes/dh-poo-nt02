package br.com.digitalhouse.aula6_integracao2.exercicio_guiado.models;

import java.util.Calendar;
import java.util.Date;

public class Impressora {

  private String modelo;
  private String tipoConexao;
  private int folhasDisponiveis;
  private Date dataFabricacao;

  public Impressora(String modelo, String tipoConexao){
    this.modelo = modelo;
    this.tipoConexao = tipoConexao;
    Calendar calendar = Calendar.getInstance();
    calendar.set(2022, 7, 9);
    this.dataFabricacao = calendar.getTime();
    this.folhasDisponiveis = 0;
  }

  public Impressora(String modelo, String tipoConexao, int numeroDeFolhas){
    this.modelo = modelo;
    this.tipoConexao = tipoConexao;
    Calendar calendar = Calendar.getInstance();
    this.dataFabricacao = calendar.getTime();
    this.folhasDisponiveis = numeroDeFolhas;
  }

  private boolean temPapel(){
    return this.folhasDisponiveis > 0;
  }

  public void imprimir(String texto){
    if(temPapel()){
      System.out.println(texto);
    } else {
      System.out.println("Não tem papel!");
    }
  }

  public Date getDataFabricacao() {
    return dataFabricacao;
  }
}
