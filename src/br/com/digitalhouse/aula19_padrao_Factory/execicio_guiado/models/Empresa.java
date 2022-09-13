package br.com.digitalhouse.aula19_padrao_Factory.execicio_guiado.models;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String cnpj;
    private List<Empregado> empregados = new ArrayList<>();

    public Empresa(String cnpj) {
        this.cnpj = cnpj;
    }

    public double calcularSalarioTotal(int dias){
        double total = 0;
        for (Empregado empregado: empregados){
            total += empregado.calcularSalario(dias);
        }
        return total;
    }

    public void addEmpregado(Empregado empregado){
        empregados.add(empregado);
    }
}
