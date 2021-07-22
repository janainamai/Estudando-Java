package br.com.janaina.devdojo.Rcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.janaina.devdojo.Rcollections.domain.Filme;

/**
 * Binary Search é uma forma de fazer busca em uma coleção ou array, muito
 * parecido com index of, mas binary search faz algo a mais: binary search:
 * retorna a posição que eu deveria inserir o elemento caso ele não
 * 
 * @author Janaina
 *
 */
public class FbinarySearch {
	public static void main(String[] args) {
		// Atenção: para poder utilizar o Binary Search, a lista obrigatoriamente
		// precisa estar ordenada.
		List<Integer> numeros = new ArrayList<>();
		numeros.add(2);
		numeros.add(0);
		numeros.add(4);
		numeros.add(3);

		Collections.sort(numeros);
		Collections.binarySearch(numeros, 2);
		// 0, 2, 3, 4 -> os valores da nossa lista
		// 0, 1, 2, 3 -> a sequência deles, inciando em zero
		// portanto, a saída do binarySearch é: 1

		// Agora, se procurarmos por um valor que não existe na lista:
		Collections.binarySearch(numeros, 1);
		// a saída será a posição que este número deveria estar:
		// saída: -2
		
		// Por que -2?
		// Existe uma fórmula: (-(ponto de insersão) -1), ela foi criada para que sempre
		// que retornar um valor positivo, signifique que o valor procurado existe, e
		// sempre que retornar um número negativo, signifique que não existe.

		// =================== Vejamos um outro exemplo com Objeto
		List<Filme> filmes = new ArrayList<Filme>();
		filmes.add(new Filme(5L, "Terror", 50D));
		filmes.add(new Filme(1L, "Suspense", 40D));
		filmes.add(new Filme(4L, "Romance", 20D));
		filmes.add(new Filme(3L, "Infantil", 10D));
		filmes.add(new Filme(2L, "Musical", 30D));

		Collections.sort(filmes);
		for (Filme filme : filmes) {
			System.out.println(filme);
		}
		
		// Agora iremos procurar por um filme com binarySearch:
		Filme filmeToSearch = new Filme(2L, "Musical", 30D);  
		System.out.println(Collections.binarySearch(filmes, filmeToSearch));

	}
}
