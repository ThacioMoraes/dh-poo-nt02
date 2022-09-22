package br.com.digitalhouse.aula21_padrao_state.exercicio_mesa.models;

import java.util.ArrayList;
import java.util.List;

public class Carrinho implements Estado{

    private Estado estado;

    private List<Object> produtos;

    public Carrinho() {
        this.estado = new Vazio(this);
        this.produtos = new ArrayList<>();
    }

    public List<Object> getProdutos() {
        return produtos;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void esvaziar() {
        this.produtos = new ArrayList<>();
    }

    @Override
    public void adicionarProduto(Produto produto) {
        this.estado.adicionarProduto(produto);
    }

    @Override
    public void cancelarCarrinho() {
        this.estado.cancelarCarrinho();
    }

    @Override
    public void retornar() {
        this.estado.retornar();
    }

    @Override
    public void avancar() {
        this.estado.avancar();
    }

}
