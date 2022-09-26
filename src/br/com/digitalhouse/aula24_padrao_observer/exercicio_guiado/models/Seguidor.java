package br.com.digitalhouse.aula24_padrao_observer.exercicio_guiado.models;

public class Seguidor implements Observer{

    private int numNotificacoes;
    private String nome;
    private String sobrenome;

    public Seguidor(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numNotificacoes = 0;
    }

    @Override
    public void atualizar(String mensagem) {
        numNotificacoes ++;
        System.out.println(nome + " " + sobrenome + ": " + mensagem);
    }

    public int getNumNotificacoes(){
        return this.numNotificacoes;
    }
}
