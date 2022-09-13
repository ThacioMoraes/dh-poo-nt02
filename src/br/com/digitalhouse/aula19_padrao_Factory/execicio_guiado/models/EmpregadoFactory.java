package br.com.digitalhouse.aula19_padrao_Factory.execicio_guiado.models;

public class EmpregadoFactory {

    private static EmpregadoFactory instancia;

    private EmpregadoFactory(){}

    public static EmpregadoFactory getInstancia(){
        if(instancia == null){
            instancia = new EmpregadoFactory();
        }
        return instancia;
    }

    public Empregado criarEmpregado(String tipoEmpregado){
        if(tipoEmpregado == "EMP-INT"){
            return new EmpregadoRelacaoDep();
        } else if(tipoEmpregado == "EMP-EXT"){
            return new EmpregadoContratado();
        } return null;
    }
}
