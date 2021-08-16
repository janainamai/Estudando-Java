package br.com.janaina.devdojo.Wmap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMap1 {
	public static void main(String[] args) {
		NavigableMap<String, String> map = new TreeMap<>();
		map.put("A", "Letra A");
		map.put("B", "Letra B");
		map.put("C", "Letra C");
		map.put("D", "Letra D");
		map.put("E", "Letra E");
		map.put("F", "Letra F");
		
		for(Map.Entry<String, String> entry : map.entrySet())
			System.out.println(entry.getKey() + " " + entry.getValue());
		
		
	}
}
