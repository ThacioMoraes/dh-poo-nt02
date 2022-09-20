package br.com.digitalhouse.aula21_padrao_state.exercicio_guiado.Models;

public class Feliz implements Estado{

    private Tamagochi t;

    public Feliz(Tamagochi t) {
        this.t = t;
        System.out.println("Tô feliz!");
    }

    @Override
    public void comer() {
        System.out.println("Não estou com fome, obrigado!");
    }

    @Override
    public void beber() {
        System.out.println("Beep beep beep beep beep!");
    }

    @Override
    public void carinho() {
        System.out.println("Obrigado pelo carinho!");
    }
}
