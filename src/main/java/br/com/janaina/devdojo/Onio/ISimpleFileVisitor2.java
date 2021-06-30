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
		// conhecendo outros m�todos do SimpleFileVisitor
		
		// walkFileTree pede par�metros: 
			// onde queremos come�ar
			// o comportamento do que quero fazer quando estiver navegando nesses diret�rios
				// para definir esse comportamento, criaremos uma nova classe ListAllFiles
		
		Path root = Paths.get("pasta");
		Files.walkFileTree(root, new ListAllFiles());
		
	}
}

class ListAllFiles extends SimpleFileVisitor<Path> {

	/**
	 * Invocado pelo File para entrar em um diret�rio.
	 */
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		System.out.println(file.getFileName());
		return FileVisitResult.CONTINUE;
	}

	/**
	 * Invocado antes de entrar em um diret�rio.
	 */
	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		System.out.println("pre visit: " + dir.getFileName());
		return FileVisitResult.CONTINUE;
	}

	/**
	 * Invocado quando a entrada no diret�rio falha.
	 */
	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		// TODO Auto-generated method stub
		return super.visitFileFailed(file, exc);
	}

	/**
	 * Invocado ap�s entrar no diret�rio e em todos os seus descendentes.
	 */
	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		System.out.println("Finalizou " + dir.getFileName());
		return super.postVisitDirectory(dir, exc);
	}
	
	
	
}
