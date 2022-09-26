package br.com.digitalhouse.aula24_padrao_observer.exercicio_guiado.models;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements Observable{

    private String nome;
    private String sobrenome;
    List<Observer> seguidores;

    public Usuario(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.seguidores = new ArrayList<>();
    }

    public void subirFoto(){
        System.out.println("Subindo nova foto de " + nome);
        notificar(String.format("%s %s subiu uma novo foto!", nome, sobrenome));
    }

    @Override
    public void adicionar(Observer o) {
        seguidores.add(o);
    }

    @Override
    public void remover(Observer o) {
        seguidores.remove(o);
    }

    @Override
    public void notificar(String mensagem) {
        for(Observer seguidor: seguidores)
            seguidor.atualizar(mensagem);
    }
}
