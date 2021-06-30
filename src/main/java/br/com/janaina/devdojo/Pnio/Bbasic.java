package br.com.janaina.devdojo.Pnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Bbasic {

	public static void main(String[] args) throws IOException {
		// criando pasta
		Path pasta = Paths.get("pasta");
		if (Files.notExists(pasta)) {
			Path diretorioDaPasta = Files.createDirectory(pasta);
		}

		// criando pasta com arquivo .txt
		if (Files.notExists(pasta)) {
			Path pasta2 = Paths.get(pasta.toString(), "arquivo.txt");
			Path diretorioDaPasta2 = Files.createFile(pasta2);
		}
		
	}

}
