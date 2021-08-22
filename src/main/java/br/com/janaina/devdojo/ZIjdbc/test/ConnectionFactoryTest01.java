package br.com.janaina.devdojo.ZIjdbc.test;

import br.com.janaina.devdojo.ZIjdbc.domain.Publisher;
import br.com.janaina.devdojo.ZIjdbc.repository.PublisherRepository;

public class ConnectionFactoryTest01 {
	public static void main(String[] args) {
		Publisher publisher = Publisher.builder().name("DarkSide").build();
		PublisherRepository.save(publisher);
		
	}
}
