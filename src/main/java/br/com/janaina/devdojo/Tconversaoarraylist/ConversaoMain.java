package br.com.janaina.devdojo.Tconversaoarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class ConversaoMain {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);

		// desta forma retorna um Array de objetos, que n�o � muito interessante
		numeros.toArray();

		// desta forma escolhemos o tipo de objeto que queremos na lista gerada
		// setamos zero pois dessa forma o Java descobre o tamanho do Array que ele
		// precisa criar
		Integer[] integerArray = numeros.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integerArray));

		// =============================

		// FORMA UM
		Integer[] numerosArray = new Integer[3];
		numerosArray[0] = 1;
		numerosArray[1] = 2;
		numerosArray[2] = 3;

		List<Integer> arrayAsList = Arrays.asList(numerosArray);
		// aqui digo que a posi��o zero agora vale 12
		arrayAsList.set(0, 12);
		
		// isso aqui gera um erro, devido termos convertido da forma anterior
		arrayAsList.add(19);
		
		// FORMA DOIS
		
		// ent�o como transformar em List sem causar esse problema?
		// inserimos o array convertido em uma nova List
		List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
		numerosList.add(15);

	}
}
