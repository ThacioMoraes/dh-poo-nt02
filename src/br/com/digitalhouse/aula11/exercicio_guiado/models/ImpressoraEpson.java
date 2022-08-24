package br.com.digitalhouse.aula11.exercicio_guiado.models;

public class ImpressoraEpson extends Impressora{

  public ImpressoraEpson(String modelo, String tipoConexao, int folhasDisponiveis,
      double porcentagemTinta) {
    super(modelo, tipoConexao, folhasDisponiveis, porcentagemTinta);
  }

  @Override
  public String imprimir(){
    if(super.temPapel() && !super.precisaTinta()){

      super.setFolhasDisponiveis(super.getFolhasDisponiveis() - 1);
      super.setPorcentagemTinta(super.getPorcentagemTinta() - 0.01);
      return "imprimindo...";
    }
    return "Por favor, cheque sua tinta e papel!";
  }

}
