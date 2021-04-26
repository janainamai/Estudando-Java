package br.com.janaina.estudando.mvc.model;

public interface ICRUD<Objeto> {
	public void cadastrar(Objeto objeto);

	public Objeto pegarPorID(int id);

}
