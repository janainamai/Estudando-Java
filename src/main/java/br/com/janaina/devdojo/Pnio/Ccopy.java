package br.com.janaina.devdojo.Pnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ccopy {
	public static void main(String[] args) throws IOException {
		//copiando um arquivo existente e renomeando-o

		//criando uma pasta
		Path pasta = Paths.get("pasta");
		Path diretorioDaPasta = Files.createDirectory(pasta);
		
		//criando arquivo dentro da pasta
		Path arquivotxt = Paths.get(diretorioDaPasta.toString(), "arquivo.txt");
		Path diretorioTxt = Files.createFile(arquivotxt);

		//copiando arquivo, informamos origem e destino
		Path origem = arquivotxt;
		Path destino = Paths.get(pasta.toString(), "arquivo_copiado.txt");
		Files.copy(origem, destino);
	}
}
