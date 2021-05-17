package br.com.janaina.devdojo.Nio;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class File01 {
	public static void main(String[] args) {
		// criando um novo arquivo .txt, precisamos tratar possível exceção
		File file = new File("arquivo.txt");
		try {
			boolean foiCriado = file.createNewFile();
			System.out.println("Criado: " + foiCriado);
		} catch (IOException exception) {
			exception.printStackTrace();
		}

		//buscando o caminho absoluto do arquivo
		String caminho = file.getAbsolutePath();
		System.out.println(caminho);
		
		//verificando se é um diretório(pasta) 
		file.isDirectory();
		
		//verificando se é oculto
		file.isHidden();
		
		//verificando quando ele foi modificado pela última vez
		//o retorno é em segundos
		long ultimaModificacao = file.lastModified();
		Date dataModificacao = new Date(ultimaModificacao);
		System.out.println(dataModificacao);
		
		// verificando se o arquivo existe
		if(file.exists()) {
			// deletando um arquivo .txt, não precisamos tratar a excessão
			boolean foiDeletado = file.delete();
			System.out.println("Deletado: " + foiDeletado);
		}
		
		
		
	}
}
