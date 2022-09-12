package br.com.digitalhouse.aula18.padrao_singleton.exercicio_singleton.models;

public class HistoricoCompras {

    private static HistoricoCompras instancia;
    private double lucros;

    private HistoricoCompras(){
    }

    public static HistoricoCompras getInstancia() {
        if(instancia == null){
            instancia = new HistoricoCompras();
        }
        return instancia;
    }

    public void adicionarLucros(double lucros) {
        this.lucros += lucros;
    }

    public double getLucros() {
        return lucros;
    }
}
