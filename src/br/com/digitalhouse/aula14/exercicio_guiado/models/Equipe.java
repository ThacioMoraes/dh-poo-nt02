package br.com.digitalhouse.aula14.exercicio_guiado.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Equipe {

    private String nome;
    private List<Jogador> listaJogadores;

    public Equipe(String nome) {
        this.nome = nome;
        this.listaJogadores = new ArrayList<>();
    }

    public List<Jogador> getListaJogadores() {
        return listaJogadores;
    }

    public void addJogador(Jogador j){
        listaJogadores.add(j);
    }

    public void mostrarTitulares(){
        Collections.sort(listaJogadores);

        for(Jogador jogador: listaJogadores){
            if(jogador.isTitular()){
                System.out.println("nome: " + jogador.getNome() + ", numero: " + jogador.getNumCamisa());
            }
        }
    }

    public int getLesionados(){
        int contador = 0;

        for(Jogador jogador: listaJogadores){
            if(jogador.isLesionado()){
                contador++;
            }
        }
        return contador;
    }
}
