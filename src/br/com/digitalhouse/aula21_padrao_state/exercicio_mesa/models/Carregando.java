package br.com.digitalhouse.aula21_padrao_state.exercicio_mesa.models;

public class Carregando implements Estado {

    Carrinho carrinho;
    public Carregando(Carrinho carrinho) {
        System.out.println("O carrinho agora está carregando!");
        this.carrinho = carrinho;
    }

    @Override
    public void adicionarProduto(Produto produto) {
        System.out.println("Adicionando produto!");
        carrinho.getProdutos().add(produto);
    }

    @Override
    public void cancelarCarrinho() {
        this.retornar();
    }

    @Override
    public void retornar() {
        carrinho.esvaziar();
        carrinho.setEstado(new Vazio(carrinho));
    }

    @Override
    public void avancar() {
        carrinho.setEstado(new Pagando(carrinho));
    }
}
