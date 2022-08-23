package br.com.digitalhouse.aula10.exemplos_heranca;

import br.com.digitalhouse.aula10.exemplos_heranca.models.Exemplo;
import br.com.digitalhouse.aula10.exemplos_heranca.models.FilhoExemplo;
import br.com.digitalhouse.aula10.exemplos_heranca.models.NetoExemplo;

public class Main {

  public static void main(String[] args) {

    NetoExemplo ex = new NetoExemplo("João", "da Silva");

    System.out.println(ex.getNome());

    Exemplo ex1 = new FilhoExemplo("Thácio", "Moraes");

    FilhoExemplo castExemplo = (FilhoExemplo) ex1;

    castExemplo.teste();

  }

}
