package br.com.janaina.devdojo.Pnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class FBasicFileAttributes {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("pasta/basicfileattributes2.txt");
		// setando que tipo de FileAttributes eu quero que o m�todo readAttributes retorne
		BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
		
		FileTime creationTime = basicFileAttributes.creationTime();
		FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
		FileTime lastAccessTime = basicFileAttributes.lastAccessTime();
		
		System.out.println("creationTime " + creationTime);
		System.out.println("lastModifiedTime " + lastModifiedTime);
		System.out.println("lastAccessTime " + lastAccessTime);
		
		// agora iremos alterar algumas dessas informa��es, e para isso basta inserir 'View':
		// BasicFileAttributesView, DosFilesAttributesView, PosixFileAttributesView
		// nos d�o m�todos que nos permitem fazer altera��es
		
		// exemplo, vamos pegar nosso arquivo, antes usamos readAttributes, agora usamos getFileAttributeView
		BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
		
		// pegando a hora atual do meu sistema operacional
		FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
		
		// fazendo altera��es
		// alterando a data de �ltima altera��o do arquivo
		fileAttributeView.setTimes(lastModifiedTime, newCreationTime, creationTime);
		
		lastModifiedTime = fileAttributeView.readAttributes().lastAccessTime();
		System.out.println("--- ap�s altera��o");
		System.out.println("lastModifiedTime " + lastModifiedTime);
	}

}
