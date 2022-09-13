package br.com.digitalhouse.aula19_padrao_Factory.execicio_guiado.models;

public class EmpregadoRelacaoDep extends Empregado{

    private double salarioMensal;

    public EmpregadoRelacaoDep(){
        super();
    }

    public EmpregadoRelacaoDep(String nome, String sobrenome, String arquivo, double salarioMensal) {
        super(nome, sobrenome, arquivo);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario(int dias) {
        return this.salarioMensal/30 * dias;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
