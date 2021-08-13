package br.com.janaina.devdojo.ZAGenericsDois;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest1 {
	public static void main(String[] args) {
		List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa"));
	}
	
	private static <T> List<T> criarArrayComUmObjeto(T t) {
		List<T> arrayList = new ArrayList<T>();
		arrayList.add(t);
		return arrayList;
	}
}
