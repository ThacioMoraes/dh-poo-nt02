package br.com.digitalhouse.aula22_padrao_composite.exercicio_guiado.models;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Item> listaItens;

    public Carrinho() {
        this.listaItens = new ArrayList<>();
    }

    public void inserirItem(Item item){
        listaItens.add(item);
    }

    public void mostrarItem(){
        System.out.println("Itens do carrinho:");
        for (Item item: listaItens){
            System.out.println(listaItens.indexOf(item) + 1 + " - " + item.getNome());
        }
    }

    public double valorTotal(){
        double valorTotal = 0;
        for (Item item: listaItens){
            valorTotal += item.calcularPreco();
        }
        return valorTotal;
    }
}
