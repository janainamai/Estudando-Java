package br.com.janaina.devdojo.ZClambdas.test;

import java.util.function.BiFunction;

import br.com.janaina.devdojo.ZClambdas.domain.Filme;

public class MethodReferenceTest04 {
	public static void main(String[] args) {
		
		BiFunction<String, Integer, Filme> filmeBiFunction = Filme::new;
		System.out.println(filmeBiFunction.apply("Isolados", 14));
	}
}
