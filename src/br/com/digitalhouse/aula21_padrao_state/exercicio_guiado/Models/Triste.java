package br.com.digitalhouse.aula21_padrao_state.exercicio_guiado.Models;

public class Triste implements Estado{

    private Tamagochi t;

    public Triste(Tamagochi t) {
        this.t = t;
        System.out.println("Tô triste!");
    }

    @Override
    public void comer() {
        System.out.println("Não quero comida!");
    }

    @Override
    public void beber() {
        System.out.println("Não tô com sede!");
    }

    @Override
    public void carinho() {
        System.out.println("Obrigado pelo carinho!");
        t.setEstado(new Feliz(t));
    }
}
