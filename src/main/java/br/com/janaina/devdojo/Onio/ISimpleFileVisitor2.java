package br.com.janaina.devdojo.Onio;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class ISimpleFileVisitor2 {
	public static void main(String[] args) throws IOException {
		// conhecendo outros métodos do SimpleFileVisitor
		
		// walkFileTree pede parâmetros: 
			// onde queremos começar
			// o comportamento do que quero fazer quando estiver navegando nesses diretórios
				// para definir esse comportamento, criaremos uma nova classe ListAllFiles
		
		Path root = Paths.get("pasta");
		Files.walkFileTree(root, new ListAllFiles());
		
	}
}

class ListAllFiles extends SimpleFileVisitor<Path> {

	/**
	 * Invocado pelo File para entrar em um diretório.
	 */
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		System.out.println(file.getFileName());
		return FileVisitResult.CONTINUE;
	}

	/**
	 * Invocado antes de entrar em um diretório.
	 */
	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		System.out.println("pre visit: " + dir.getFileName());
		return FileVisitResult.CONTINUE;
	}

	/**
	 * Invocado quando a entrada no diretório falha.
	 */
	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		// TODO Auto-generated method stub
		return super.visitFileFailed(file, exc);
	}

	/**
	 * Invocado após entrar no diretório e em todos os seus descendentes.
	 */
	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		System.out.println("Finalizou " + dir.getFileName());
		return super.postVisitDirectory(dir, exc);
	}
	
	
	
}
