package br.com.janaina.devdojo.Henumerador.domain;

public class Cliente extends Pessoa {
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, String cpf, int idade, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        super(nome, cpf, idade);
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "tipoCliente=" + tipoCliente +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public void Imprimir() {
        System.out.println("Nome " + super.getNome());
        System.out.println("CPF " + super.getCpf());
        System.out.println("Idade " + super.getIdade());
        System.out.println("Tipo: " + getTipoCliente());
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
