package br.com.janaina.devdojo.Onio;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HDirectoryStream {
	public static void main(String[] args) {
		// DirectoryStream � uma das formar mais f�ceis que temos
		// de pegarmos todos os arquivos de um diret�rio

		// pegando todos os arquivos do nosso diret�rio atual
		Path dir = Paths.get(".");

		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
			for (Path path : stream)
				System.out.println(path.getFileName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
