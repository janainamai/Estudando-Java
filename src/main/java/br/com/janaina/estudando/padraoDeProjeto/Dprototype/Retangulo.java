package br.com.janaina.estudando.padraoDeProjeto.Dprototype;

public class Retangulo extends Forma{
	public int altura;
    public int largura;

    public Retangulo() {
    }

    public Retangulo(Retangulo target) {
        super(target);
        if (target != null) {
            this.altura = target.altura;
            this.largura = target.largura;
        }
    }

    @Override
    public Forma clone() {
        return new Retangulo(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Retangulo) || !super.equals(object2)) return false;
        Retangulo retangulo2 = (Retangulo) object2;
        return retangulo2.altura == altura && retangulo2.largura == largura;
    }

}
