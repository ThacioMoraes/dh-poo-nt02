package br.com.digitalhouse.aula19_padrao_Factory.execicio_guiado;

import br.com.digitalhouse.aula19_padrao_Factory.execicio_guiado.models.EmpregadoContratado;
import br.com.digitalhouse.aula19_padrao_Factory.execicio_guiado.models.EmpregadoFactory;
import br.com.digitalhouse.aula19_padrao_Factory.execicio_guiado.models.EmpregadoRelacaoDep;
import br.com.digitalhouse.aula19_padrao_Factory.execicio_guiado.models.Empresa;

public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("123456789");

        EmpregadoFactory empregadoFactory = EmpregadoFactory.getInstancia();

        EmpregadoRelacaoDep e1 = (EmpregadoRelacaoDep) empregadoFactory.criarEmpregado("EMP-INT");
        EmpregadoContratado e2 = (EmpregadoContratado) empregadoFactory.criarEmpregado("EMP-EXT");

        e1.setSalarioMensal(1500.0);
        e2.setImposto(0.1);
        e2.setValorPorHora(50.0);

        empresa.addEmpregado(e1);
        empresa.addEmpregado(e2);

        System.out.println("O salário de e1 é: " + e1.calcularSalario(30));
        System.out.println("O salário de e2 é: " + e2.calcularSalario(30));
        System.out.println("O valor total de salário é: " + empresa.calcularSalarioTotal(30));

    }
}
