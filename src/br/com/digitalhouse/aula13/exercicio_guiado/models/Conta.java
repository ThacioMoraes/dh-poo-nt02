package br.com.digitalhouse.aula13.exercicio_guiado.models;

public abstract class Conta {

    private double saldo;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public double informarSaldo(){
        return this.saldo;
    }

    public abstract void sacar(double valor);
}
