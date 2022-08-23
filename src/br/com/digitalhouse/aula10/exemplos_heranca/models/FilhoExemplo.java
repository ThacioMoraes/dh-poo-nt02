package br.com.digitalhouse.aula10.exemplos_heranca.models;

public class FilhoExemplo extends Exemplo{

  private String sobrenome;
  public FilhoExemplo(String nome, String sobrenome) {
    super(nome);
    this.sobrenome = sobrenome;
  }
  public void teste(){
    System.out.println("olá!");
  }

}
