package br.com.digitalhouse.aula21_padrao_state.exercicio_mesa.models;

public interface Estado {
    void adicionarProduto(Produto produto);
    void cancelarCarrinho();
    void retornar();
    void avancar();
}
