package br.com.digitalhouse.aula21_padrao_state.exercicio_mesa;

import br.com.digitalhouse.aula21_padrao_state.exercicio_mesa.models.Carrinho;
import br.com.digitalhouse.aula21_padrao_state.exercicio_mesa.models.Produto;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("Bola de basquete");
        Produto p2 = new Produto("Camisa do lakers");

        Carrinho carrinho = new Carrinho();

        carrinho.cancelarCarrinho();
        carrinho.retornar();
        carrinho.adicionarProduto(p1);
        carrinho.avancar();
        carrinho.adicionarProduto(p2);
        carrinho.retornar();
        carrinho.adicionarProduto(p2);
        carrinho.avancar();
        carrinho.avancar();
        carrinho.retornar();
        carrinho.adicionarProduto(p1);
        carrinho.cancelarCarrinho();
        carrinho.avancar();
    }
}
