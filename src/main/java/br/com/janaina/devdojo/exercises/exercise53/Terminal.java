package br.com.janaina.devdojo.exercises.exercise53;

public class Terminal {
    public static void main(String[] args) {
        FuncionarioMetodos fM = new FuncionarioMetodos();
        Funcionario f = new Funcionario();
        f.nome = "Janaina";
        f.idade = 21;
        f.salarios = new double[] {1500, 1800, 2570};

        fM.ImprimirDados(f);
    }
}
