package br.com.digitalhouse.aula13.exercicio_guiado.models;

public class ContaPoupanca extends Conta{

    @Override
    public void sacar(double valor) {
        if(super.informarSaldo() >= valor) {
            super.setSaldo(super.informarSaldo() - valor);
        }
        else{
            System.out.println("Saldo insuficiente!");
        }
    }

    public void cobrarJuros(){
        super.setSaldo(super.informarSaldo() + super.informarSaldo()*0.01);
    }
}
