package br.com.digitalhouse.aula22_padrao_composite.exercicio_guiado.models;

public class Produto extends Item{

    private double preco;

    public Produto(String nome, double preco) {
        super(nome);
        this.preco = preco;
    }

    @Override
    public double calcularPreco() {
        return this.preco;
    }
}
