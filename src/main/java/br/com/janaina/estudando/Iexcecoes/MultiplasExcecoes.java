package br.com.janaina.estudando.Iexcecoes;

public class MultiplasExcecoes {
	public static void main(String[] args) {
		try {
			throw new ArithmeticException();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
