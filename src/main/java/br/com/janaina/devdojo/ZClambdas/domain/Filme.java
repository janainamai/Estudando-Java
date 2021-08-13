package br.com.janaina.devdojo.ZClambdas.domain;

public class Filme {
	private String titulo;
	private int quantidadeEstoque;
	
	public Filme(String titulo, int quantidadeEstoque) {
		super();
		this.titulo = titulo;
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	@Override
	public String toString() {
		return "Filme [titulo=" + titulo + ", quantidadeEstoque=" + quantidadeEstoque + "]";
	}
	
	
}
