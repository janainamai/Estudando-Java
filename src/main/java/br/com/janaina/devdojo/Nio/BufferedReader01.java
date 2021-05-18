package br.com.janaina.devdojo.Nio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader01 {
	public static void main(String[] args) {
		File file = new File("arquivo.txt");

		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String linha;
			while ((linha = bufferedReader.readLine()) != null) {
				System.out.println(linha);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
