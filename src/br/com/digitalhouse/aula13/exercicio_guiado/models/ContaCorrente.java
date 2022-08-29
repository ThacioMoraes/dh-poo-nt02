package br.com.digitalhouse.aula13.exercicio_guiado.models;

public class ContaCorrente extends Conta implements GravarImposto{

    private double valorPermitido;

    @Override
    public void sacar(double valor) {
        if(this.valorPermitido >= valor && this.informarSaldo() >= valor + imposto(valor)) {
            super.setSaldo(super.informarSaldo() - (valor + imposto(valor)));
        }
        else{
            System.out.println("Saldo insuficiente ou valor acima do permitido!");
        }
    }

    @Override
    public double imposto(double porc) {
        return porc * 0.05;
    }
}
