package br.com.janaina.devdojo.Sbinarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class list {
	public static void main(String[] args) {
		List<Filme> filmes = new ArrayList<Filme>();
		filmes.add(new Filme(5L, "Terror", 50D));
		filmes.add(new Filme(1L, "Suspense", 40D));
		filmes.add(new Filme(4L, "Romance", 20D));
		filmes.add(new Filme(3L, "Infantil", 10D));
		filmes.add(new Filme(2L, "Musical", 30D));

		Collections.sort(filmes, new FilmeSortByIdComparator());
		
		for (Filme filme : filmes) {
			System.out.println(filme);
		}

		Filme filmeToSearch = new Filme(2L, "Musical", 30D);
		System.out.println(Collections.binarySearch(filmes, filmeToSearch, new FilmeSortByIdComparator()));
	}
}

