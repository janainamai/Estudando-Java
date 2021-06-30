package br.com.janaina.devdojo.Onio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class GDosFileAttributes {
	public static void main(String[] args) throws IOException {
		// vamos tornar esse arquivo ser oculto, depois ser readOnly
		Path path = Paths.get("pasta/teste.txt");

		if (Files.notExists(path))
			Files.createFile(path);

		//com Files
			// não oculto
			Files.setAttribute(path, "dos:hidden", false);
			// não readOnly
			Files.setAttribute(path, "dos:readonly", false);
			
		// com DosFileAttributes, primeiro DosFileAttributes para ver, e DosFileAttributesView para alterar
			DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
			System.out.println("hidden: " + dosFileAttributes.isHidden());
			System.out.println("readOnly: " + dosFileAttributes.isReadOnly());
			
			// alterando
			DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
			// oculto
			fileAttributeView.setHidden(true);
			// readOnly
			fileAttributeView.setReadOnly(true);
			System.out.println("--- após alteração");
			System.out.println("hidden: " + fileAttributeView.readAttributes().isHidden());
			System.out.println("readOnly: " + fileAttributeView.readAttributes().isReadOnly());
			
	}
}
