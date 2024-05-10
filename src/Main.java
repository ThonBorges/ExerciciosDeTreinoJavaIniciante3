import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        1 - Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
        incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
        impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
        */

        int senha;

        System.out.println("Digite sua senha: ");
        senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha inválida, digite novamente!");
            senha = sc.nextInt();
        }

        System.out.println("Acesso Permitido!");

        /*
        2 - Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
        cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
        menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
        */
        int X, Y;

        System.out.println("Escreva um valor inteiro (positivo ou negativo) para o valor de X e Y, respectivamente: ");
        X = sc.nextInt();
        Y = sc.nextInt();
        
        while (X != 0 && Y != 0) {
            if (X > 0 && Y > 0) {
                System.out.println("Primeiro quadrante.");
            } else if (X < 0 && Y < 0) {
                System.out.println("Segundo quadrante!");
            } else if (X < 0 && Y > 0) {
                System.out.println("Terceiro Quadrante!");
            } else {
                System.out.println("Quarto quadrante!");
            }
            X = sc.nextInt();
            Y = sc.nextInt();
        }

        /*
        3 - Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
        exemplo.
        */

        int alcool, gasolina, diesel, usuario;

        alcool = 0;
        gasolina = 0;
        diesel = 0;

        System.out.println("Escolha com qual tipo de combustivel irá abastecer:\n 1. Álcool\n 2. Gasolina\n 3.Diesel\n 4.SAIR");
        usuario = sc.nextInt();

        while (usuario != 4) {
            if (usuario == 1) {
                alcool ++;
            } else if (usuario == 2) {
                gasolina ++;
            } else if (usuario == 3) {
                diesel ++;
            } else {
                System.out.println("Digite um número válido!");
            }
            usuario = sc.nextInt();
        }

        System.out.println("Muito Obrigado!\n" + "Álcool: " + alcool + "\nGasolina: " + gasolina + "\nDiesel: " + diesel);

        sc.close();   
    }
}
