package br.com.janaina.devdojo.ZIjdbc.test;

import java.util.List;

import br.com.janaina.devdojo.ZIjdbc.domain.Publisher;
import br.com.janaina.devdojo.ZIjdbc.service.PublisherService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest01 {
	public static void main(String[] args) {
		List<Publisher> publishers = PublisherService.findAll();
		publishers.forEach(p -> log.info(p));
	}
}
