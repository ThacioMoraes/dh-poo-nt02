package br.com.digitalhouse.aula21_padrao_state.exercicio_mesa.models;

public class Pagando implements Estado {

    Carrinho carrinho;
    public Pagando(Carrinho carrinho) {
        System.out.println("Pagando carrinho!");
        this.carrinho = carrinho;
    }

    @Override
    public void adicionarProduto(Produto produto) {
        System.out.println("Não é possível adicionar produtos! retorne para o passo anterior");
    }

    @Override
    public void cancelarCarrinho() {
        carrinho.esvaziar();
        carrinho.setEstado(new Vazio(carrinho));
    }

    @Override
    public void retornar() {
        carrinho.setEstado(new Carregando(carrinho));
    }

    @Override
    public void avancar() {
        carrinho.setEstado(new Fechado(carrinho));
    }
}
