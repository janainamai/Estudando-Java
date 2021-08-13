package br.com.janaina.devdojo.WMap;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {
	public static void main(String[] args) {
		Consumidor consumidor1 = new Consumidor("Janaina");
		Consumidor consumidor2 = new Consumidor("Helo�sa");
		
		Map<Consumidor, EnumFaixaEtaria> map = new HashMap<>();
		
		map.put(consumidor1, EnumFaixaEtaria.INFANTIL);
		map.put(consumidor2, EnumFaixaEtaria.ADULTO);
		
		for(Map.Entry<Consumidor, EnumFaixaEtaria> entry : map.entrySet()) {
			System.out.println(entry.getKey().getNome() + " " + entry.getValue());
		}
	}
}

enum EnumFaixaEtaria {
	INFANTIL,
	ADULTO,
	IDOSO
}
