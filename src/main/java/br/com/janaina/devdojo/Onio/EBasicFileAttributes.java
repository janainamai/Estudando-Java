package br.com.janaina.devdojo.Onio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class EBasicFileAttributes {
	public static void main(String[] args) throws IOException {
		// trocando a date de modificação de um arquivo do jeito antigo
		LocalDateTime date = LocalDateTime.now().minusDays(10); 
		File file = new File("pasta/basicfileatributes.txt"); 
		 
		boolean criado = file.createNewFile(); 
		boolean modificado = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli()); 
		
		// trocando a date de modificação de um arquivo do jeito novo
		Path path = Paths.get("pasta/basicfileattributes2.txt");
		Files.createFile(path);
		FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
		Files.setLastModifiedTime(path, fileTime);
		
	}
}
