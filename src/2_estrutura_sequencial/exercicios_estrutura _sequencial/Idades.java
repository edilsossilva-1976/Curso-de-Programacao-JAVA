

/*
 * Problema "idades" 
 * Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os 
 * nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo. 
 */

import java.util.Locale;
import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int idade, idade2;
        String nome, nome2;
        double media;

        System.out.println("DADOS DA PRIMEIRA PESSOA:");
        System.out.print("Nome:");
        nome = input.nextLine();

        System.out.print("Idade:");
        idade = input.nextInt();

        System.out.println("DADOS DA SEGUNDA PESSOA:");
        System.out.print("Nome:");
        nome2 = input.nextLine();

        System.out.print("Idade:");
        idade2 = input.nextInt();

        media = (idade + idade2)/2;

        System.out.printf("A idade média de %s e %s é de %.2f anos.", nome, nome2, media);

        input.close();
    }
}
