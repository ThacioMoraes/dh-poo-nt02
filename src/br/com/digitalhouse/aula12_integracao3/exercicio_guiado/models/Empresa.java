package br.com.digitalhouse.aula12_integracao3.exercicio_guiado.models;


import java.util.ArrayList;

public class Empresa {

  private String nome;
  private String cnpj;
  private ArrayList<Funcionario> funcionarios;

  public Empresa(String nome, String cnpj) {
    this.nome = nome;
    this.cnpj = cnpj;
    this.funcionarios = new ArrayList<>();
  }

  public void adicionaFuncionario(Funcionario funcionario){
    this.funcionarios.add(funcionario);
  }
}
