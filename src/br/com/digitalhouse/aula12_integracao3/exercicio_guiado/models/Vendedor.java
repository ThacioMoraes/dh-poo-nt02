package br.com.digitalhouse.aula12_integracao3.exercicio_guiado.models;

public class Vendedor extends Funcionario{

  private double comissao;

  public Vendedor(String nome, String sobrenome, String cpf, String email, String matricula,
      double salario, double comissao) {
    super(nome, sobrenome, cpf, email, matricula, salario);
    this.comissao = comissao;
  }

  @Override
  public double pagamento() {
    return super.getSalario() + this.comissao;
  }
}
