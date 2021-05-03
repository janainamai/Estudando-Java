package br.com.janaina.devdojo.Henumerador.test;

import br.com.janaina.devdojo.Henumerador.domain.Cliente;
import br.com.janaina.devdojo.Henumerador.domain.TipoCliente;
import br.com.janaina.devdojo.Henumerador.domain.TipoPagamento;

public class test01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Janaina", "08546086990", 21, TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);

        Cliente cliente2 = new Cliente("Heloísa", "22012258000298", 20, TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente.getNomeRelatorio());
    }
}