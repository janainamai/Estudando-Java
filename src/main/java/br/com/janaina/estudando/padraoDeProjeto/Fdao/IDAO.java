package br.com.janaina.estudando.padraoDeProjeto.Fdao;

import java.util.ArrayList;

public interface IDAO<T> {
	ArrayList<T> getAll();
	T create(T item);
	T get(int id);
	boolean update(int id, T item);
	boolean remove(int id);
}
