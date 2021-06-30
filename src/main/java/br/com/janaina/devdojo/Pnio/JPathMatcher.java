package br.com.janaina.devdojo.Pnio;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class JPathMatcher {
	public static void main(String[] args) {
		// PathMatcher: classe criada para facilitar um pouco a busca por Paths

		// criaremos alguns arquivos para poder comparar
		Path path1 = Paths.get("pasta/subpasta/file.html");
		Path path2 = Paths.get("pasta/subpasta/file.txt");
		Path path3 = Paths.get("pasta/subpasta/file.java");
		
		// verificando se o path1 termina com .html
		matches(path1, "glob:**.html");
		
		// verificando se o path2 termina com .html, .java ou .txt
		matches(path2, "glob:**.{java,txt,html}");
		
		// verificando se o path3 termina com 3 letras 
		matches(path3, "glob:**.????");
		
		// verificando se o path possui o nome file finalizado de 3 letras
		matches(path1, "glob:**/file.????");
		
	}

	/**
	 * Verifica se o path recebido no parâmetro está de acordo com o glob recebido.
	 * 
	 * @param path Path
	 * @param glob Parâmetro
	 */
	public static void matches(Path path, String glob) {
		// o PathMatcher possui uma documentação específica sobre o glob

		PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
		System.out.println(glob + ": " + matcher.matches(path));
	}
}
