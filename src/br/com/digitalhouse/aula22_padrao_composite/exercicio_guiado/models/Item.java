package br.com.digitalhouse.aula22_padrao_composite.exercicio_guiado.models;

public abstract class Item {
    private String nome;

    public String getNome() {
        return nome;
    }

    public Item(String nome) {
        this.nome = nome;
    }

    public abstract double calcularPreco();
}
