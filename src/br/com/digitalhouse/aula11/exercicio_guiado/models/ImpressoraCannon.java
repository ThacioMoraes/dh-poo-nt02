package br.com.digitalhouse.aula11.exercicio_guiado.models;

public class ImpressoraCannon extends Impressora{

  public ImpressoraCannon(String modelo, String tipoConexao, int folhasDisponiveis,
      double porcentagemTinta) {
    super(modelo, tipoConexao, folhasDisponiveis, porcentagemTinta);
  }

  @Override
  public boolean precisaTinta(){
    if(super.getPorcentagemTinta() >= 0.02){
      return false;
    }
    return true;
  }

  @Override
  public String imprimir(){
    if(super.temPapel() && !precisaTinta()){

      super.setFolhasDisponiveis(super.getFolhasDisponiveis() - 1);
      super.setPorcentagemTinta(super.getPorcentagemTinta() - 0.02);
      return "imprimindo...";
    }
    return "Por favor, cheque sua tinta e papel!";
  }

}
