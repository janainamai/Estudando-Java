package br.com.janaina.devdojo.Onio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Path04 {

	public static void main(String[] args) {
		//relativize 

		//nós informamos um endereço, e informamos um endereço a qual queremos chegar 
		//a partir do primeiro endereço informado 

		Path estou = Paths.get("/home/janaina"); 
		Path queroIr = Paths.get("/home/janaina/documento/Dados.txt"); 

		Path caminhoRestante = estou.relativize(queroIr); 

		//Se dermos um sysout no caminhoRestante, ele nos retorna isso:
		System.out.println(caminhoRestante);
		//documento/Dados.txt
		
		//também podemos fazer o caminho inverso 
		queroIr.relativize(estou); 

		//em um sysout, isto nos retorna isso: 
		System.out.println(queroIr.relativize(estou));
		//../.. 
	}
}
