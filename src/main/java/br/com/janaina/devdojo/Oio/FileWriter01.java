package br.com.janaina.devdojo.Oio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
	public static void main(String[] args) {
		File file = new File("arquivo.txt");
		try {
			file.createNewFile();
			FileWriter fileWriter = new FileWriter(file);

			// escrevendo no arquivo file
			// se eu quiser que ao escrever eu acrescente conteúdo ao invés de limpar o file:
			// FileWriter fileWriter = new FileWriter(file, true);
			fileWriter.write("Um linha!\nDuas linhas!");

			// garantindo que iremos inserir todas as informações no file
			fileWriter.flush();

		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}
}
