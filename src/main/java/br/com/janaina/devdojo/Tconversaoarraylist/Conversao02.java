package br.com.janaina.devdojo.Tconversaoarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Conversao02 {
	public static void main(String[] args) {

		List<String> strings = new ArrayList<>();
		strings.add("ed122841-d3d2-4d9c-ac6b-0829d47650f8");
		strings.add("ed222841-d3d2-4d9c-ac6b-0829d47650f8");
		strings.add("ed322841-d3d2-4d9c-ac6b-0829d47650f8");
		strings.add("ed422841-d3d2-4d9c-ac6b-0829d47650f8");
		strings.add("ed522841-d3d2-4d9c-ac6b-0829d47650f8");
		strings.add("ed622841-d3d2-4d9c-ac6b-0829d47650f8");
		
		
		List<UUID> uuid = new ArrayList<>();
		strings.stream().forEach(s -> uuid.add(UUID.fromString(s)));
		
		uuid.forEach(System.out::println);
	}
}
