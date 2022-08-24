package br.com.digitalhouse.aula10.exercicio_mesa.models;

public class Nave extends Objeto{

  private double velocidade;
  private int vida;

  public Nave(int posX, int posY, char direcao, double velocidade, int vida) {
    super(posX, posY, direcao);
    this.velocidade = velocidade;
    this.vida = vida;
  }

  public void girar(char direcao){
    super.setDirecao(direcao);
  }

  public int restaVida() {
    return vida;
  }

  @Override
  public void irA(char direcao, int posX, int posY){
    if(super.getDirecao() == direcao){
      super.setPosX(posX);
      super.setPosY(posY);
      System.out.println("Movendo-se para posição x: " + posX + " e posicão Y: " + posY + " na velocidade: " + this.velocidade );
    }
    else {
      System.out.println("Não é possivel se posicionar, gire a nave para: " + direcao);
    }
  };
}
