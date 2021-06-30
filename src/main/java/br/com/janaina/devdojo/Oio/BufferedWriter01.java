package br.com.janaina.devdojo.Oio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter01 {
	public static void main(String[] args) {
		// Recebe um FileWriter(responsável pela escrita dentro do arquivo) dentro do
		// construtor. A BufferWriter otimiza os dados, ele guarda primeiro os dados na
		// memória e depois lança-os no disco. Isso melhora a nossa performance por
		// baixo dos panos.

		// Obs.: não é recomendado utilizar \n na String, pois dependendo de sistemas
		// operacionais, alguns não reconhecem que isso é uma quebra de linha. Melhor
		// utilizar newLine();

		File file = new File("arquivo.txt");
		try {
			file.createNewFile();
			FileWriter fileWriter = new FileWriter(file);
			
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("Um linha!\nDuas linhas!");
			bufferedWriter.newLine();
			bufferedWriter.flush();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
