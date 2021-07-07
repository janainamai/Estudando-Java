package br.com.janaina.devdojo.Rcollections;

import java.util.ArrayList;
import java.util.List;

public class DlistCelular {
	public static void main(String[] args) {
		Smartphone s1 = new Smartphone("1111", "iPhone");
		Smartphone s2 = new Smartphone("2222", "Motorola");
		Smartphone s3 = new Smartphone("3333", "Samsumg");
		Smartphone s4 = new Smartphone("4444", "Pixel");
		
		// criando uma lista com capacidade de 6 elementos
		List<Smartphone> celulares = new ArrayList<Smartphone>(6);
		celulares.add(s1);
		celulares.add(s2);
		celulares.add(s3);
		for(Smartphone celular : celulares) {
			System.out.println(celular);
		}
		
		// deletando todos os elementos
		celulares.clear();
		
		// verificando se existe um objeto na lista
		celulares.contains(s3);
		
		// o List mantém a ordem do índice
		// conseguimos inserir elementos em determinada posição 
		celulares.add(0, s4);
		
		// conseguimos buscar o índice de determinado elemento
		// caso ele não encontre o índice, retorna -1
		int index = celulares.indexOf(s4);
		System.out.println(index);
		
	}

}

class Smartphone {
	private String serialNumber;
	private String marca;
	
	public Smartphone(String serialNumber, String marca) {
		this.serialNumber = serialNumber;
		this.marca = marca;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(this == obj) return true;
		if(this.getClass() != obj.getClass()) return false;
		Smartphone celular = (Smartphone) obj;
		return serialNumber != null && serialNumber.equals(celular.serialNumber);
	}

	@Override
	public String toString() {
		return "Celular [serialNumber=" + serialNumber + ", marca=" + marca + "]";
	}

	

	
}