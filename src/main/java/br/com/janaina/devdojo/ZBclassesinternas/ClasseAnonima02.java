package br.com.janaina.devdojo.ZBclassesinternas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.janaina.devdojo.ZAgenericsdois.Carro;

public class ClasseAnonima02 {
	public static void main(String[] args) {
		List<Carro> carros = new ArrayList<Carro>(List.of(new Carro("Gol"), new Carro("BMW")));
		
		carros.sort(new Comparator<Carro>() {
			@Override
			public int compare(Carro arg0, Carro arg1) {
				return arg0.getNome().compareTo(arg1.getNome());
			}
		});
		
		System.out.println(carros);
	}
}
