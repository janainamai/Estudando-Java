package br.com.janaina.devdojo.Rcollections;

import java.util.HashMap;
import java.util.Map;

/**
 * Map é uma interface que trabalha com chave e valor, para cada chave temos um
 * valor associado K: chave V: valor
 * 
 * @author Janaina
 *
 */
public class Kmap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		// Para manter a ordem dos elementos basta trocar o HashMap pelo LinkedHashMap

		map.put("teklado", "teclado");
		map.put("mouze", "mouse");
		map.put("vc", "você");

		// Se tentarmos duplicar uma chave, o valor dela será sobrescrito:
		map.put("vc", "você2");
		// agora a chave 'vc' vale 'você2'

		// Para não sobrescrever podemos utilizar outra forma de adicionar que só insere
		// caso a chave não exista ainda:
		map.putIfAbsent("vc", "você2");
		// nesse caso, não será inserido pois essa chave já existe e continuará valendo
		// 'voce'

		// Imprimindo todas as chaves:
		for (String key : map.keySet())
			System.out.println(key);
		// desta chave poderíamos pegar o valor: map.getKey(key)

		// Imprimindo valores:
		for (String value : map.values())
			System.out.println(value);

		// Outra forma de pegarmos a chave e valor é com entrySet: nos retorna um objeto
		// que terá a chave e valor, mas a forma de criar o foreach fica um pouco
		// estranha
		for (Map.Entry<String, String> entry : map.entrySet())
			System.out.println(entry.getKey() + " " + entry.getValue());
	}
}
