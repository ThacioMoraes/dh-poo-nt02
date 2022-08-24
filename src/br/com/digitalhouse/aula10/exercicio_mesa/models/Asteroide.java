package br.com.digitalhouse.aula10.exercicio_mesa.models;

public class Asteroide extends Objeto{

  private int dano;

  public Asteroide(int posX, int posY, char direcao, int dano) {
    super(posX, posY, direcao);
    this.dano = dano;
  }

  @Override
  public void irA(char direcao, int posX, int posY){
      super.setPosX(posX);
      super.setPosY(posY);
      super.setDirecao(direcao);
      System.out.println("Movendo-se para posição x: " + posX + " e posicão Y: " + posY + ".");
  };

}
