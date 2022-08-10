package br.com.digitalhouse.aula5.exercicio_guiado;

import br.com.digitalhouse.aula5.exercicio_guiado.models.Cliente;

public class Main {

  public static void main(String[] args) {
    Cliente c1 = new Cliente("Thácio", 1);

    System.out.println("Cliente número " + c1.getNumeroCliente() + " criado!");

    c1.aumentarDivida(100);

    System.out.println(c1.getNome() + ", sua dívida é de " + c1.getDivida());

    c1.pagarDivida(50);

    System.out.println("após pagamento, sua dívida é de " + c1.getDivida());
  }

}
