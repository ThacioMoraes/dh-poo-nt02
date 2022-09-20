package br.com.digitalhouse.aula21_padrao_state.exercicio_guiado.Models;

public class Fome implements Estado {

    private Tamagochi t;

    public Fome(Tamagochi t) {
        this.t = t;
        System.out.println("Tô com fome!");
    }

    @Override
    public void comer() {
        System.out.println("Obrigado pela comida!");
        t.setEstado(new Feliz(t));
    }

    @Override
    public void beber() {
        System.out.println("Não estou com sede!");
    }

    @Override
    public void carinho() {
        System.out.println("Não quero carinho, tô com fome!");
    }
}
