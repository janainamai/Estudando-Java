package br.com.janaina.devdojo.Rcollections;

public class BequalsComEnum {
	public static void main(String[] args) {

		enumFaixaEtaria faixaEtaria = enumFaixaEtaria.INFANTIL;
		enumTipoPessoa tipoPessoa = enumTipoPessoa.FISICA;

		// o equals não nos avisa em casos onde o tipo é diferente
		
		// abaixo comparamos dois enum's com equals e não recebemos nenhum aviso de erro
		tipoPessoa.equals(faixaEtaria);
		// retorno: false
		
		// quando comparamos com == ele nos alerta (descomente)
		//if(tipoPessoa == faixaEtaria) { }
		
	}
}

enum enumFaixaEtaria {
	INFANTIL,
	ADULTO,
	IDOSO
}

enum enumTipoPessoa {
	FISICA,
	JURIDICA
}
