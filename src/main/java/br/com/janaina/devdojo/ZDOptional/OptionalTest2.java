package br.com.janaina.devdojo.ZDOptional;

import java.util.Optional;

import br.com.janaina.devdojo.ZDOptional.domain.Serie;
import br.com.janaina.devdojo.ZDOptional.repository.SerieRepository;

public class OptionalTest2 {
	// dado um reposit�rio de s�ries
	// 1. procurar s�rie por t�tulo, se existir, apenas atualizar o t�tulo da s�rie
	// 2. procurar s�rie por id, se n�o existir, lan�ar uma Exe��o IlegalArgumentException
	// 3. procurar s�rie por t�tulo, caso n�o exista, criar nova s�rie
	
	public static void main(String[] args) {
		Optional<Serie> serieTitle = SerieRepository.findByTitle("Dark");
		
		// se existir, apenas atualizar o t�tulo da s�rie
		serieTitle.ifPresent(s -> s.setTitulo("Dark atualizado"));
		System.out.println(serieTitle);
		
		// se n�o existir, lan�ar uma Exe��o IlegalArgumentException
		Serie serieById = SerieRepository.findById(2).orElseThrow(IllegalArgumentException::new);
		System.out.println(serieById);
		
		// caso n�o exista, criar nova s�rie
		Serie newSerie = SerieRepository.findByTitle("The 100").orElse(new Serie(3, "The 100", 50));
		System.out.println(newSerie);
	}
}
