package br.com.digitalhouse.aula22_padrao_composite.exercicio_guiado.models;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Item{

    private List<Produto> produtos;

    public Combo(String nome) {
        super(nome);
        this.produtos = new ArrayList<>();
    }

    public void inserirProduto(Produto produto){
        produtos.add(produto);
    }
    @Override
    public double calcularPreco() {
        double valorTotal = 0;
        for(Produto produto: produtos){
            valorTotal += produto.calcularPreco();
        }
        return valorTotal * 0.9;
    }
}
