package br.com.janaina.devdojo.Onio;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HDirectoryStream {
	public static void main(String[] args) {
		// DirectoryStream é uma das formar mais fáceis que temos
		// de pegarmos todos os arquivos de um diretório

		// pegando todos os arquivos do nosso diretório atual
		Path dir = Paths.get(".");

		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
			for (Path path : stream)
				System.out.println(path.getFileName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
