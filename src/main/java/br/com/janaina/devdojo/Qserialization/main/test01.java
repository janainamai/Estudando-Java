package br.com.janaina.devdojo.Qserialization.main;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import br.com.janaina.devdojo.Qserialization.dominio.Aluno;
import br.com.janaina.devdojo.Qserialization.dominio.Turma;

public class test01 {
	public static void main(String[] args) {
		// criando um objeto
		Aluno aluno = new Aluno(1L, "Janaina Mai", "admin");
		Turma turma = new Turma("Java Core");
		aluno.setTurma(turma);
		
		// salvando o estado deste objeto
		serializar(aluno);
		
		// consultando o objeto (lendo)
		deserializar();
	}
	
	public static void serializar(Aluno aluno) {
		Path path = Paths.get("pasta/aluno.ser");
		try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
			oos.writeObject(aluno);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void deserializar() {
		Path path = Paths.get("pasta/aluno.ser");
		try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
			Aluno aluno = (Aluno) ois.readObject();
			System.out.println(aluno);
		} catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
