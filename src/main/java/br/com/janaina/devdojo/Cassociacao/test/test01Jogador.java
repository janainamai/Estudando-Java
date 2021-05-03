package br.com.janaina.devdojo.Cassociacao.test;

import br.com.janaina.devdojo.Cassociacao.domain.Jogador;

public class test01Jogador {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Azul");
        Jogador jogador2 = new Jogador("Vermelho");
        Jogador jogador3 = new Jogador("Verde");

        // três formas
        // forma 1
        Jogador[] jogadores1 = new Jogador[3];
        jogadores1[0] = jogador1;
        jogadores1[1] = jogador2;
        jogadores1[2] = jogador3;

        // forma 2
        Jogador[] jogadores2 = new Jogador[] {jogador1, jogador2, jogador3};

        // forma 3
        Jogador[] jogadores3 = {jogador1, jogador2, jogador3};

        for(Jogador jogador : jogadores1) {
            jogador.Imprimir();
        }
    }
}
