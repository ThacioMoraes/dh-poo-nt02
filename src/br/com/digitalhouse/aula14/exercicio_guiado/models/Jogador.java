package br.com.digitalhouse.aula14.exercicio_guiado.models;

public class Jogador implements Comparable<Jogador>{

    private int numCamisa;
    private String nome;
    private boolean lesionado;
    private boolean titular;

    public Jogador(int numCamisa, String nome, boolean lesionado, boolean titular) {
        this.numCamisa = numCamisa;
        this.nome = nome;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public String getNome() {
        return nome;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public boolean isTitular() {
        return titular;
    }

    @Override
    public int compareTo(Jogador jogador) {
        return this.numCamisa - jogador.numCamisa;
    }


}
