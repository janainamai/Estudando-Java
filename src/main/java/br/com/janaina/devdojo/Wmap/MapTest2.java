package br.com.janaina.devdojo.Wmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest2 {
	public static void main(String[] args) {
		Consumidor janaina = new Consumidor("Janaina");
		Consumidor heloisa = new Consumidor("Helo�sa");

		Map<Consumidor, List<EnumItem>> map = new HashMap<>();

		List<EnumItem> itensJanaina = List.of(EnumItem.CARRO, EnumItem.APARTAMENTO);
		List<EnumItem> itensHeloisa = List.of(EnumItem.MOTO, EnumItem.SOBRADO);

		map.put(janaina, itensJanaina);
		map.put(heloisa, itensHeloisa);

		for (Map.Entry<Consumidor, List<EnumItem>> entry : map.entrySet()) {
			System.out.println(entry.getKey().getNome());
			for (EnumItem value : entry.getValue())
				System.out.println(value);
			System.out.println(" ");
		}
	}
}

enum EnumItem {
	CARRO, CASA, SOBRADO, APARTAMENTO, EMPRESA, CAMINHAO, MOTO
}