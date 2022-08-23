package br.com.digitalhouse.aula10.exercicio_guiado.models;

public class AssociadoHabilitado extends Associado {

  private double custoPiscina;
  private boolean habilitado;

  public AssociadoHabilitado(String numAssociado, String nome, double valorMensal, String atividade,
      double custoPiscina) {
    super(numAssociado, nome, valorMensal, atividade);
    this.custoPiscina = custoPiscina;
    this.habilitado = false;
  }

  public void habilitar(){
    this.habilitado = true;
  }

  @Override
  public double custoMensal(){
    if(habilitado){
      return super.getValorMensal() + this.custoPiscina;
    }
    return super.getValorMensal();
  }
}
