package br.com.janaina.estudando.padraoDeProjeto.Cbuilder;

public class Console {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa.PessoaBuilder()
				.nome("Janaina")
				.ultimoNome("Mai")
				.apelido("Jana")
				.criarPessoa();
	}
}

