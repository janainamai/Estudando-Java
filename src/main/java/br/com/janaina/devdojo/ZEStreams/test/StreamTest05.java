package br.com.janaina.devdojo.ZEStreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest05 {
	
	public static void main(String[] args) {
		List<String> words = List.of("Asere", "He", "Ha", "Dehe");
		
		List<String> letters = words.stream()
			.map(w -> w.split("")) // neste momento temos um Stream<String[]>
			.flatMap(Arrays::stream) // agora usamos flatMap, para retornar um Stream<String>
			.collect(Collectors.toList());
		
		System.out.println(letters);
	}
}
