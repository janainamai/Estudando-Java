package br.com.janaina.devdojo.Eheranca.test;

import br.com.janaina.devdojo.Eheranca.domain.Endereco;
import br.com.janaina.devdojo.Eheranca.domain.Funcionario;
import br.com.janaina.devdojo.Eheranca.domain.Pessoa;

import java.sql.SQLOutput;

public class test01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Achil Von Gilsa");
        endereco.setCep("89086-116");

        Pessoa pessoa = new Pessoa("Alice Vendel");
        pessoa.setCpf("12378945655");
        pessoa.setEndereco(endereco);

        Funcionario funcionario1 = new Funcionario("Heloísa Vendel Theiss");
        funcionario1.setCpf("12345678900");
        funcionario1.setEndereco(endereco);
        funcionario1.setSalario(1500);

        Funcionario funcionario2 = new Funcionario("Janaina Mai");
        funcionario2.setCpf("08546086990");
        funcionario2.setEndereco(endereco);
        funcionario2.setSalario(2570);

        System.out.println();

        funcionario1.Imprimir();

        System.out.println();

        funcionario2.Imprimir();



    }
}
