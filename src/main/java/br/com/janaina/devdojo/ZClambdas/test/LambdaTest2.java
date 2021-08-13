package br.com.janaina.devdojo.ZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest2 {
	// function: � uma interface funcional, teremos um tipo T e um tipo R
		// T: irei receber
		// R: irei retornar
	
	public static void main(String[] args) {
		List<String> strings = List.of("Janaina", "Mai", "Helo�sa", "Theiss");
		
		map(strings, String::length);
		map(strings, String::toUpperCase);
		
		
//		System.out.println(upperCase);
//		System.out.println(lenght);
		
	}
	
	private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
		List<R> result = new ArrayList<R>();
		for (T t : list) {
			R r = function.apply(t);
			result.add(r);
		}
		return result;
	}
}
