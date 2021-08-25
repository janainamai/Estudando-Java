package br.com.janaina.devdojo.ZIjdbc.test;

import java.util.List;

import br.com.janaina.devdojo.ZIjdbc.domain.Publisher;
import br.com.janaina.devdojo.ZIjdbc.service.PublisherService;

public class ConnectionFactoryTest01 {

	public static void main(String[] args) {
		Publisher publisher1 = Publisher.builder().name("Transaction 1").build();
		Publisher publisher2 = Publisher.builder().name("Transaction 2").build();
		Publisher publisher3 = Publisher.builder().name("").build();
		PublisherService.saveTransaction(List.of(publisher1, publisher2, publisher3));
	}
}
