package br.com.digitalhouse.aula18.padrao_singleton.exercicio_integradora_singleton;

import br.com.digitalhouse.aula18.padrao_singleton.exercicio_integradora_singleton.models.FabricaDeCarro;

public class Main {

    public static void main(String[] args) {
        FabricaDeCarro f1 = FabricaDeCarro.getInstancia();
        FabricaDeCarro f2 = FabricaDeCarro.getInstancia();
        FabricaDeCarro f3 = FabricaDeCarro.getInstancia();

        System.out.println(f2.criarCarroFiat());
        System.out.println(f1.criarCarroVolks());
        System.out.println(f2.criarCarroFord());
        System.out.println(f1.criarCarroFiat());
        System.out.println(f3.criarCarroVolks());

        System.out.println(f1.gerarRelatorio());

    }
}
