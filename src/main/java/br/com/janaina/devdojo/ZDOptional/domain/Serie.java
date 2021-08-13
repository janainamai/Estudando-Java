package br.com.janaina.devdojo.ZDOptional.domain;

public class Serie {
	private Integer id;
	private String titulo;
	private int episodeos;
	
	public Serie(Integer id, String titulo, int episodeos) {
		this.id = id;
		this.titulo = titulo;
		this.episodeos = episodeos;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getEpisodeos() {
		return episodeos;
	}
	public void setEpisodeos(int episodeos) {
		this.episodeos = episodeos;
	}
	public Integer getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Serie [id=" + id + ", titulo=" + titulo + ", episodeos=" + episodeos + "]";
	}
}
