package br.com.digitalhouse.aula11.exercicio_guiado;

import br.com.digitalhouse.aula11.exercicio_guiado.models.ImpressoraCannon;
import br.com.digitalhouse.aula11.exercicio_guiado.models.ImpressoraEpson;

public class ExercicioGuiado {

  public static void main(String[] args) {

    ImpressoraCannon cannon = new ImpressoraCannon("xyz", "Wi-fi", 10, 0.03);
    ImpressoraEpson epson = new ImpressoraEpson("abc", "usb", 0, 0.01);

    System.out.println(epson.imprimir());
    epson.setFolhasDisponiveis(2);
    System.out.println(epson.imprimir());
    System.out.println(epson.imprimir());

    System.out.println(cannon.imprimir());
    System.out.println(cannon.imprimir());

  }

}
