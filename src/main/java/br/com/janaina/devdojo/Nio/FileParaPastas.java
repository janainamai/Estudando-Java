package br.com.janaina.devdojo.Nio;

import java.io.File;
import java.io.IOException;

public class FileParaPastas {
	public static void main(String[] args) throws IOException {
		//criando pastas 
		File pasta = new File("pasta"); 
		boolean diretorioCriado = pasta.mkdir(); 

		//criando arquivos .txt e pastas 
		File arquivotxt = new File("C:\\Users\\senior\\Desktop\\Estudando-Java\\pasta\\arquivo.txt"); 
		boolean arquivoCriado = arquivotxt.createNewFile(); 

		//criando arquivox .txt em pastas existentes 
		File arquivotxt2 = new File(pasta, "arquivo.txt"); 
		boolean arquivoCriado2 = arquivotxt2.createNewFile(); 

		//renomeando um arquivo 
		File arquivoRenomeado = new File(pasta, "arquivo_renomeado.txt"); 
		boolean arquivoFoiRenomeado = arquivotxt2.renameTo(arquivoRenomeado); 

		//renomeando uma pasta 
		File pastaRenomeada = new File("pasta2"); 
		boolean pastaFoiRenomeada = pasta.renameTo(pastaRenomeada); 
	}
}
