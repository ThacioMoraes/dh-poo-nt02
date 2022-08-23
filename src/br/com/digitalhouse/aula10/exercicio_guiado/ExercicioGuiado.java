package br.com.digitalhouse.aula10.exercicio_guiado;

import br.com.digitalhouse.aula10.exercicio_guiado.models.Associado;
import br.com.digitalhouse.aula10.exercicio_guiado.models.AssociadoHabilitado;

public class ExercicioGuiado {

  public static void main(String[] args) {
    Associado a1 = new Associado("1", "Cazé", 100, "Lutas");
    AssociadoHabilitado a2 = new AssociadoHabilitado("2", "Milton", 110, "Musculação", 50);

    System.out.println(a1.custoMensal());
    System.out.println(a2.custoMensal());
    a2.habilitar();
    System.out.println(a2.custoMensal());
  }

}
