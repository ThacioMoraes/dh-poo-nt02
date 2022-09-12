package br.com.digitalhouse.aula18.padrao_singleton.exercicio_singleton.models;

public class Vendedor {

    private double comissao;
    private HistoricoCompras historicoCompras = HistoricoCompras.getInstancia();

    public void realizarVenda(double venda, double percentComissao){
        this.comissao += venda * percentComissao;
        historicoCompras.adicionarLucros(venda * (1 - percentComissao));
    }

    public double getComissao(){
        return this.comissao;
    }
}
