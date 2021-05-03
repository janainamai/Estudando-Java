package br.com.janaina.devdojo.Bmodificadorestatico.test;

import br.com.janaina.devdojo.Bmodificadorestatico.domain.Carro;

public class testCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes", 275);
        Carro carro3 = new Carro("Audi", 290);

        Carro.setVelocidadeLimite(120);
        carro1.setNome("Gol");
        carro1.Imprimir();
        carro2.Imprimir();
        carro3.Imprimir();


    }
}
