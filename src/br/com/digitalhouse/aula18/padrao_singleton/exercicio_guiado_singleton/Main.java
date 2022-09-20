package br.com.digitalhouse.aula18.padrao_singleton.exercicio_guiado_singleton;

import br.com.digitalhouse.aula18.padrao_singleton.exercicio_guiado_singleton.models.HistoricoCompras;
import br.com.digitalhouse.aula18.padrao_singleton.exercicio_guiado_singleton.models.Vendedor;

public class Main {

    public static void main(String[] args) {
        Vendedor v1 = new Vendedor();
        Vendedor v2 = new Vendedor();
        Vendedor v3 = new Vendedor();

        v1.realizarVenda(100.0, 0.1);
        v2.realizarVenda(200.0, 0.2);
        v3.realizarVenda(50.0, 0.5);

        HistoricoCompras historico = HistoricoCompras.getInstancia();

        System.out.println("Comissão Vendedor 1: " + v1.getComissao());
        System.out.println("Comissão Vendedor 2: " + v2.getComissao());
        System.out.println("Comissão Vendedor 3: " + v3.getComissao());
        System.out.println("Lucro da loja: " + historico.getLucros());
    }
}
