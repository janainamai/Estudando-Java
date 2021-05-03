package br.com.janaina.devdojo.Aintroducao;

public class Aula20EstruturasCondicionais {
    public static void main(String[] args) {
        //OPERADOR IF ELSE
        //verificando se o usuário pode comprar bebida alcólica
        int age = 20;
        int minAge = 18;
        boolean isAuthorizedBuyAlcohol = age >= minAge;

        if(isAuthorizedBuyAlcohol)
            System.out.println("Autorizado.");
        else
            System.out.println("Não autorizado.");

        //OPERADOR TERN�?RIO
        /*idade < 15 infantil
        idade > 15 e < 18 juvenil
        idade >= 18 aduldo*/

        //(condição) ? verdadeiro : falso
        String resultado = (age < 15) ? "Infantil" : (age >= 15 && age < 18) ? "Juvenil" : "Adulto";
        System.out.println("Categoria " + resultado + ".");
    }
}
