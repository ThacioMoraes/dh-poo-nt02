package br.com.digitalhouse.aula21_padrao_state.exercicio_mesa.models;

public class Fechado implements Estado {

    Carrinho carrinho;
    public Fechado(Carrinho carrinho) {
        System.out.println("Carrinho fechado!");
        this.carrinho = carrinho;
    }

    @Override
    public void adicionarProduto(Produto produto) {
        System.out.println("Não é possível adicionar produtos! Carrinho fechado!");
    }

    @Override
    public void cancelarCarrinho() {
        System.out.println("Não é possível cancelar! Carrinho fechado!");
    }

    @Override
    public void retornar() {
        System.out.println("Não é possível retornar! Carrinho fechado!");
    }

    @Override
    public void avancar() {
        carrinho.esvaziar();
        carrinho.setEstado(new Vazio(carrinho));
    }
}
