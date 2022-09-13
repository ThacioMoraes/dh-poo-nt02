package br.com.digitalhouse.aula19_padrao_Factory.execicio_guiado.models;

public abstract class Empregado {

    private String nome;
    private String sobrenome;
    private String arquivo;

    public Empregado(){

    }
    public Empregado(String nome, String sobrenome, String arquivo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.arquivo = arquivo;
    }

    public abstract double calcularSalario(int dias);
}
