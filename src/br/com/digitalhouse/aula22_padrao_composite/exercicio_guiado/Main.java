package br.com.digitalhouse.aula22_padrao_composite.exercicio_guiado;

import br.com.digitalhouse.aula22_padrao_composite.exercicio_guiado.models.Carrinho;
import br.com.digitalhouse.aula22_padrao_composite.exercicio_guiado.models.Combo;
import br.com.digitalhouse.aula22_padrao_composite.exercicio_guiado.models.Produto;

public class Main {
    public static void main(String[] args) {

        Produto batataFrita = new Produto("Batata Frita", 10.0);
        Produto refri = new Produto("Coca-cola", 8.50);
        Produto hamburguer = new Produto("X-burguer", 20.0);

        Combo c1 = new Combo("Clássico");
        c1.inserirProduto(batataFrita);
        c1.inserirProduto(refri);
        c1.inserirProduto(hamburguer);

        Carrinho carrinho = new Carrinho();

        carrinho.inserirItem(batataFrita);
        carrinho.inserirItem(refri);
        carrinho.inserirItem(hamburguer);
        //carrinho.inserirItem(c1);

        carrinho.mostrarItem();
        System.out.println("O valor total é: " + carrinho.valorTotal());
    }
}
