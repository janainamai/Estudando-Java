package br.com.janaina.devdojo.Qserialization.dominio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Aluno implements Serializable{
	
	private static final long serialVersionUID = 6924335204895588576L;
	
	private Long id;
	private String nome;
	private transient String password;
	private static final String NOME_ESCOLA = "DevDojo Virado no Jiraya";
	private transient Turma turma;
	

	public Aluno(Long id, String nome, String password) {
		super();
		this.id = id;
		this.nome = nome;
		this.password = password;
	}
	
	//mostrando como serializar
	private void writeObject(ObjectOutputStream oos) {
		try {
			oos.defaultWriteObject();
			oos.writeUTF(turma.getNome());
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//mostrando como deserializar
	private void readObject(ObjectInputStream ois) {
		try {
			ois.defaultReadObject();
			String nomeTurma = ois.readUTF();
			turma = new Turma(nomeTurma);
		} catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public String toString() {
		return "Aluno [id=" + id +
				", nome=" + nome + 
				", password=" + password + 
				", turma=" + turma + "]";
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public Turma getTurma() {
		return turma;
	}


	public void setTurma(Turma turma) {
		this.turma = turma;
	}


	public static String getNomeEscola() {
		return NOME_ESCOLA;
	}
	
	

}