package br.com.janaina.devdojo.Henumerador.domain;

public enum TipoPagamento {
    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcularDesconto(double valor);

}
