package br.com.digitalhouse.aula21_padrao_state.exercicio_mesa.models;


public class Vazio implements Estado{

    Carrinho carrinho;

    public Vazio(Carrinho carrinho){
        System.out.println("O carrinho está vazio!");
        this.carrinho = carrinho;
    }

    @Override
    public void adicionarProduto(Produto produto) {
        System.out.println("Adicionando produto e mudando de estado");
        carrinho.getProdutos().add(produto);
        carrinho.setEstado(new Carregando(carrinho));
    }

    @Override
    public void cancelarCarrinho() {
        System.out.println("O carrinho já se encontra vazio!");
    }

    @Override
    public void retornar() {
        System.out.println("Não é possível retornar!");
    }

    @Override
    public void avancar() {
        System.out.println("Não é possível avançar");
    }
}
