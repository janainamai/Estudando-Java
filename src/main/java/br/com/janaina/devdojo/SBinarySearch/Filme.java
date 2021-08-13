package br.com.janaina.devdojo.SBinarySearch;

public class Filme implements Comparable<Filme> {
	private Long id;
	private String genero;
	private Double preco;
	
	public Filme() {}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filme other = (Filme) obj;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (preco == null) {
			if (other.preco != null)
				return false;
		} else if (!preco.equals(other.preco))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Filme [id=" + id + ", genero=" + genero + ", preco=" + preco + "]";
	}

	
	public Filme(Long id, String genero, Double preco) {
		this.id = id;
		this.genero = genero;
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getgenero() {
		return genero;
	}

	public void setgenero(String genero) {
		this.genero = genero;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public int compare(Filme filmeUm, Filme filmeDois) {
		return filmeUm.getgenero().compareTo(filmeDois.getgenero());
	}

	public int compareTo(Filme outroFilme) {
		return this.genero.compareTo(outroFilme.getgenero());
	}

}