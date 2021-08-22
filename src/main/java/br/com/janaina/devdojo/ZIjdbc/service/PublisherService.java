package br.com.janaina.devdojo.ZIjdbc.service;

import java.util.List;

import br.com.janaina.devdojo.ZIjdbc.domain.Publisher;
import br.com.janaina.devdojo.ZIjdbc.repository.PublisherRepository;

public class PublisherService {

	public static void save(Publisher publisher) {
		PublisherRepository.save(publisher);
	}
	
	public static void delete(Integer id) {
		validateId(id);
		PublisherRepository.delete(id);
	}
	
	public static void update(Publisher publisher) {
		validateId(publisher.getId());
		PublisherRepository.update(publisher);
	}
	
	public static List<Publisher> findAll() {
		List<Publisher> publishers = PublisherRepository.findAll();
		return publishers;
	}
	
	public static void validateId(Integer id) {
		if(id == null || id <= 0) {
			throw new IllegalArgumentException("Invalid value for id");
		}
	}
}
