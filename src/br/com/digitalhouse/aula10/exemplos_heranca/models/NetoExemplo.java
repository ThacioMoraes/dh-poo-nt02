package br.com.digitalhouse.aula10.exemplos_heranca.models;

public class NetoExemplo extends FilhoExemplo{

  public NetoExemplo(String nome, String sobrenome) {
    super(nome, sobrenome);
  }

  public void teste(){
    System.out.println("olá");;
  }
}
