package br.com.digitalhouse.aula12_integracao3.exercicio_guiado.models;

public abstract class Funcionario {

  private String nome;
  private String sobrenome;
  private String cpf;
  private String email;
  private String matricula;
  private double salario;

  public Funcionario(String nome, String sobrenome, String cpf, String email, String matricula,
      double salario) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.cpf = cpf;
    this.email = email;
    this.matricula = matricula;
    this.salario = salario;
  }

  public double getSalario() {
    return salario;
  }

  public abstract double pagamento();
}
