package br.com.janaina.devdojo.Bmodificadorestatico.test;

import br.com.janaina.devdojo.Bmodificadorestatico.domain.Empresa;

public class testEmpresa {
    public static void main(String[] args) {
        Empresa senior = new Empresa("Senior Sistemas");
        senior.EnviarDados("Blumenau", "123.123.123/0001-01", 15);
        senior.ImprimirDados();
    }
}
