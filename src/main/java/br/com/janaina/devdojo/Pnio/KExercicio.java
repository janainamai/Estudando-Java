package br.com.janaina.devdojo.Pnio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class KExercicio {
	// utilizando SimpleFileVisitor e PathMatcher
	// retornar todos os arquivos do nosso projeto 
	// que tenha test no nome, e que termine com .java ou .class

	public static void main(String[] args) throws IOException {
		Path root = Paths.get(".");
		Files.walkFileTree(root, new ListExercise());
	}
	
	public static class ListExercise extends SimpleFileVisitor<Path>{

		@Override
		public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
			// validar
			if(matches(file, "glob:**/*test*.{java,class}"))
				System.out.println(file.getFileName());
				
			return FileVisitResult.CONTINUE;
		}

		public static boolean matches(Path path, String glob) {
			PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
			return matcher.matches(path);
		}
		
	}
}
