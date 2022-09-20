package br.com.digitalhouse.aula18.padrao_singleton.exercicio_integradora_singleton.models;

public class FabricaDeCarro {

    private static FabricaDeCarro instancia;

    protected int totalCarrosFiat;
    protected int totalCarrosFord;
    protected int totalCarrosVolks;

    private FabricaDeCarro(){}

    public static FabricaDeCarro getInstancia(){
        if(instancia == null){
            instancia = new FabricaDeCarro();
        }
        return instancia;
    }

    public String criarCarroVolks() {
        totalCarrosVolks++;
        return new String("Carro Volks #" + totalCarrosVolks + " criado.");
    }

    public String criarCarroFord() {
        totalCarrosFord++;
        return new String("Carro Ford #" + totalCarrosFord + " criado.");
    }

    public String criarCarroFiat() {
        totalCarrosFiat++;
        return new String("Carro Fiat #" + totalCarrosFiat + " criado.");
    }

    public String gerarRelatorio() {

        return new String("Total de carros Fiat vendidos: " + totalCarrosFiat
                + "\nTotal de carros Ford vendidos: " + totalCarrosFord
                + "\nTotal de carros Volks vendidos: " + totalCarrosVolks);
    }
}

