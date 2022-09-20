package br.com.digitalhouse.aula21_padrao_state.exercicio_guiado.Models;

public class Sede implements Estado{

    private Tamagochi t;

    public Sede(Tamagochi t) {
        this.t = t;
        System.out.println("Tô com sede!");
    }

    @Override
    public void comer() {
        System.out.println("Não estou com fome, estou com sede!");
    }

    @Override
    public void beber() {
        System.out.println("Obrigado pela bebida!");
        t.setEstado(new Feliz(t));
    }

    @Override
    public void carinho() {
        System.out.println("Não quero carinho, tô com sede!");
    }
}
