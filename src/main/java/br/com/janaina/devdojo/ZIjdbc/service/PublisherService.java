package br.com.janaina.devdojo.ZIjdbc.service;

import java.util.List;

import br.com.janaina.devdojo.ZIjdbc.domain.Publisher;
import br.com.janaina.devdojo.ZIjdbc.repository.PublisherRepository;

public class PublisherService {

	public static void save(Publisher publisher) {
		PublisherRepository.save(publisher);
	}
	
	public static void saveTransaction(List<Publisher> publishers) {
		PublisherRepository.saveTransaction(publishers);
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
	
	public static List<Publisher> findByName(String name) {
		List<Publisher> publishers = PublisherRepository.findByName(name);
		return publishers;
	}
	
	public static List<Publisher> findByNamePreparedStatement(String name) {
		List<Publisher> publishers = PublisherRepository.findByName(name);
		return publishers;
	}
	
	public static void showDriverMetaData() {
		PublisherRepository.showDriverMetaData();
	}
	
	public static void showPublisherMetaData() {
		PublisherRepository.showPublisherMetaData();
	}
	
	public static void showTypeScrollWorking() {
		PublisherRepository.showTypeScrollWorking();
	}
	
	public static void findByNameAndUpdateToUpperCase(String name) {
		PublisherRepository.findByNameAndUpdateToUpperCase(name);
	}
	
	public static List<Publisher> findByNameAndInsertWhenNotFound(String name) {
		List<Publisher> publishers = PublisherRepository.findByNameAndInsertWhenNotFound(name);
		return publishers;
	}
	
	public static void validateId(Integer id) {
		if(id == null || id <= 0) {
			throw new IllegalArgumentException("Invalid value for id");
		}
	}
}
