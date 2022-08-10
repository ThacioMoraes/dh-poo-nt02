package br.com.digitalhouse.integracao2.exercicio_guiado;

import br.com.digitalhouse.integracao2.exercicio_guiado.models.Impressora;

public class Main {

  public static void main(String[] args) {

    Impressora impressoraWireless = new Impressora("Epson", "Wi-Fi", 10);
    Impressora impressoraComFio = new Impressora("Canon", "USB");

    impressoraWireless.imprimir("Olá");
    impressoraComFio.imprimir("Hello");

    System.out.println(impressoraComFio.getDataFabricacao());


  }

}
