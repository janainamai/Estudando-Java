package br.com.janaina.devdojo.ZDOptional.repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import br.com.janaina.devdojo.ZDOptional.domain.Serie;

public class SerieRepository {
	private static List<Serie> series = List.of(new Serie(1, "Dark", 50), new Serie(2, "TWD", 500),
			new Serie(3, "Vis a Vis", 50));

	public static Optional<Serie> findByPredicate(Predicate<Serie> predicate) {
		Serie filter = null;
		for (Serie t : series) {
			if (predicate.test(t)) {
				filter = t;
				return Optional.of(filter);
			}
		}
		return Optional.empty();
	}

	// predicate findById
	public static Optional<Serie> findById(Integer id) {
		return findByPredicate(s -> s.getId().equals(id));
	}

	// predicate findByTitle
	public static Optional<Serie> findByTitle(String title) {
		return findByPredicate(s -> s.getTitulo().equals(title));
	}
}
