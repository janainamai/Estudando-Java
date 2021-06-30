package br.com.janaina.devdojo.Onio;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class ISimpleFileVisitor {
	public static void main(String[] args) throws IOException {
		// com SimpleFileVisitor, podemos nevegar dentro das pastas do nosso diret�rio
		// anteriormente com DirectoryStream n�o poderiamos fazer isso
		
		// walkFileTree pede par�metros: 
			// onde queremos come�ar
			// o comportamento do que quero fazer quando estiver navegando nesses diret�rios
				// para definir esse comportamento, criaremos uma nova classe ListAllFiles
		
		Path root = Paths.get(".");
		Files.walkFileTree(root, new ListAllJavaFiles());
		
	}
}

class ListAllJavaFiles extends SimpleFileVisitor<Path> {

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		// aqui iremos implementar um if que s� ir� nos mostrar os arquivos .java
		if(file.getFileName().toString().endsWith(".java"))
			System.out.println(file.getFileName());
		return FileVisitResult.CONTINUE;
	}
	
}
