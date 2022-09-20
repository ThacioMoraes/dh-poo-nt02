package br.com.digitalhouse.aula21_padrao_state.exercicio_guiado.Models;

public class Tamagochi implements Estado{

    private Estado estado;

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Tamagochi() {
        this.estado = new Fome(this);
    }

    @Override
    public void comer() {
        estado.comer();
    }

    @Override
    public void beber() {
        estado.beber();
    }

    @Override
    public void carinho() {
        estado.carinho();
    }
}
