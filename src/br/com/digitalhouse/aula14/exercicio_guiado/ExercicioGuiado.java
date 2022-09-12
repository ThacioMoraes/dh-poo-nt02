package br.com.digitalhouse.aula14.exercicio_guiado;

import br.com.digitalhouse.aula14.exercicio_guiado.models.Equipe;
import br.com.digitalhouse.aula14.exercicio_guiado.models.Jogador;

import java.util.Collections;

public class ExercicioGuiado {

    public static void main(String[]args){

        Equipe time = new Equipe("SPFC");

        Jogador j1 = new Jogador(9,"Calleri", false, true);
        Jogador j2 = new Jogador(10,"Nikão", true, true);
        Jogador j3 = new Jogador(1,"Jandrei", false, true);
        Jogador j4 = new Jogador(22,"Miranda", true, false);

        //time.addJogador(j1);
        //time.addJogador(j2);
        //time.addJogador(j3);
        //time.addJogador(j4);

        Collections.addAll(time.getListaJogadores(), j1, j2, j3, j4);

        time.mostrarTitulares();
        System.out.println("jogadores lesionados: " + time.getLesionados());
    }
}
