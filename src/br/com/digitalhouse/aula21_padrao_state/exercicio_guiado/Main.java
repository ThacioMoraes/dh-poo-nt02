package br.com.digitalhouse.aula21_padrao_state.exercicio_guiado;

import br.com.digitalhouse.aula21_padrao_state.exercicio_guiado.Models.Sede;
import br.com.digitalhouse.aula21_padrao_state.exercicio_guiado.Models.Tamagochi;
import br.com.digitalhouse.aula21_padrao_state.exercicio_guiado.Models.Triste;

public class Main {
    public static void main(String[] args) {

        Tamagochi t = new Tamagochi();
        t.carinho();
        t.comer();
        t.setEstado(new Triste(t));
        t.carinho();
        t.setEstado(new Sede(t));
        t.comer();
        t.beber();
        t.beber();
    }
}
