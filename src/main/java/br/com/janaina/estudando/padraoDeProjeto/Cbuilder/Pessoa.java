package br.com.janaina.estudando.padraoDeProjeto.Cbuilder;

public class Pessoa {
	private String nome;
	private String ultimoNome;
	private String apelido;

	private Pessoa(String nome, String ultimoNome, String apelido) {
		this.nome = nome;
		this.ultimoNome = ultimoNome;
		this.apelido = apelido;
	}

	public static class PessoaBuilder {
		private String nome;
		private String ultimoNome;
		private String apelido;

		public PessoaBuilder() {
		}

		public PessoaBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}

		public PessoaBuilder ultimoNome(String ultimoNome) {
			this.ultimoNome = ultimoNome;
			return this;
		}

		public PessoaBuilder apelido(String apelido) {
			this.apelido = apelido;
			return this;
		}

		public Pessoa criarPessoa() {
			System.out.println("Objeto criado com sucesso!");
			return new Pessoa(nome, ultimoNome, apelido);
			
		}
	}
}
