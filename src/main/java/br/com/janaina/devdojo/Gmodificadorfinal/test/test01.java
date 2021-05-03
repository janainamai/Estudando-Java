package br.com.janaina.devdojo.Gmodificadorfinal.test;

import br.com.janaina.devdojo.Gmodificadorfinal.domain.Carro;

public class test01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Janaina");
        System.out.println(carro.COMPRADOR);

    }
}
