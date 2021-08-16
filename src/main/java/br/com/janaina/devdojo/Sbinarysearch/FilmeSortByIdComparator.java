package br.com.janaina.devdojo.Sbinarysearch;

import java.util.Comparator;

public class FilmeSortByIdComparator implements Comparator<Filme>{

	public int compare(Filme filmeUm, Filme filmeDois) {
		return filmeUm.getId().compareTo(filmeDois.getId());
	}

}
