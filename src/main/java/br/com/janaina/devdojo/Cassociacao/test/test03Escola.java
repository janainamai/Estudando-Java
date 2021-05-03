package br.com.janaina.devdojo.Cassociacao.test;

import br.com.janaina.devdojo.Cassociacao.domain.Escola;
import br.com.janaina.devdojo.Cassociacao.domain.Professor;

public class test03Escola {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Romeu");
        Professor professor2 = new Professor("Julieta");
        Professor professor3 = new Professor("Amélia");

        Professor[] professores = {professor1, professor2, professor3};

        Escola escola = new Escola("Juvenal Carvalho", professores);

        escola.Imprimir();
    }
}
