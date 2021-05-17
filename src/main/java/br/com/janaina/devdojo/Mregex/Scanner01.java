package br.com.janaina.devdojo.Mregex;

import java.util.Scanner;

public class Scanner01 {
	public static void main(String[] args) {
		String texto = "Janaina,Heloísa,true,Vicky,1807";
		Scanner scanner = new Scanner(texto);
		scanner.useDelimiter(",");
		
		while(scanner.hasNext()) {
			if(scanner.hasNextInt()) {
				int i = scanner.nextInt();
			}
			else if(scanner.hasNextBoolean()) {
				boolean bool = scanner.nextBoolean();
			}
			else
				System.out.println(scanner.next());
		}
	}
}
