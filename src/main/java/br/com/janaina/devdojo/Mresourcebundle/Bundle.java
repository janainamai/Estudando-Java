package br.com.janaina.devdojo.Mresourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class Bundle {
	public static void main(String[] args) {
		System.out.println(Locale.getDefault());
		ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
		
		//verificando se existe uma chave
		boolean chave = bundle.containsKey("chave");
		
		//buscando um valor atraves de uma chave
		bundle.getString("good.morning");
		//saída: Good Morning
		
		//imagine que o usuário agora trocou o local de acesso
		bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
		
		//buscando o mesmo valor de antes
		bundle.getString("good.morning");
		//saída: Bom dia!
	}
}
