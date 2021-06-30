package br.com.janaina.devdojo.Oio;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader01 {
	public static void main(String[] args) {
		File file = new File("arquivo.txt");
		try {
			FileReader fileReader = new FileReader(file);
			int i;
			
			//-1 é quando o fileReader chega no fim do texto
			//então fazemos ele imprimir cada letra que ele estiver encontrando
			while ((i = fileReader.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
