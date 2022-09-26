package br.com.digitalhouse.aula24_padrao_observer.exercicio_guiado;

import br.com.digitalhouse.aula24_padrao_observer.exercicio_guiado.models.Seguidor;
import br.com.digitalhouse.aula24_padrao_observer.exercicio_guiado.models.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario u = new Usuario("João", "Sala Virtual");
        Seguidor s1 = new Seguidor("Thácio", "Moraes");
        Seguidor s2 = new Seguidor("Cadu", "Menezes");

        u.adicionar(s1);
        u.subirFoto();
        u.adicionar(s2);
        u.subirFoto();
        u.remover(s1);
        u.subirFoto();

        System.out.println("Notificações do Thácio: " + s1.getNumNotificacoes());
        System.out.println("Notificações do Cadu: " + s2.getNumNotificacoes());
    }
}
