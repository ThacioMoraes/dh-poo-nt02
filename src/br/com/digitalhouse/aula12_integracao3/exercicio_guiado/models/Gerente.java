package br.com.digitalhouse.aula12_integracao3.exercicio_guiado.models;

public class Gerente extends Funcionario{

  private double bonus;

  public Gerente(String nome, String sobrenome, String cpf, String email, String matricula,
      double salario, double bonus) {
    super(nome, sobrenome, cpf, email, matricula, salario);
    this.bonus = bonus;
  }

  @Override
  public double pagamento() {
    return super.getSalario() + this.bonus;
  }
}
