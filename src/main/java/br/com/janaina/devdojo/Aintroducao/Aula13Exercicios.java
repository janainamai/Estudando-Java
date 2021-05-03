package br.com.janaina.devdojo.Aintroducao;

/**
 * Crie variáveis para os campos descritos abaixo:
 *
 * Eu <nome>, morando no endereço <endereço>
 * confirmo que recebi o salario de <salario>, na data <data>
 */

public class Aula13Exercicios {
    public static void main(String[] args) {
        String name = "Janaina";
        String address = "Rua Achil Von Gilsa, 155 - bairro do Sol, Indaial - SC";
        double wage = 2540.00;
        String dateReceiptSalary = "05.04.2021";
        String report = "Eu " + name + ", morando no endereço " + address + ", confirmo que recebi o salário de R$" +
                " " + wage + ", na data de " + dateReceiptSalary + ".";
        System.out.println(report);

    }
}
