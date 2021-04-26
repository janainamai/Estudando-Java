package br.com.janaina.estudando.mvc.model;

public interface IDAO<Objeto> {
	public void cadastrar(Objeto objeto);

	public Objeto pegarPorID(int id);

}
