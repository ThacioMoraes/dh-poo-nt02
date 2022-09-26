package br.com.digitalhouse.aula24_padrao_observer.exercicio_guiado.models;

public interface Observable {
    void adicionar(Observer o);
    void remover(Observer o);
    void notificar(String mensagem);
}
