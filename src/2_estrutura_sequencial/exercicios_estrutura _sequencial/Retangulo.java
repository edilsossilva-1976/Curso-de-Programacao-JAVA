package src.2_estrutura_sequencial.exercicios_estrutura _sequencial;

/*
 * Problema "retangulo" 
 * Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor 
 * da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplos.
 */

import java.util.Locale;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double base, altura, areaTriangulo, perimetro, diagonal;

        System.out.print("Digite a base do triangulo: ");
        base = input.nextDouble();

        System.out.print("Digite o altura do triangulo: ");
        altura = input.nextDouble();

        areaTriangulo = base * altura;
        perimetro = base + (2 * altura);
        diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

        System.out.printf("Área do triangulo: %.2f%n", areaTriangulo);
        System.out.printf("Perimetro: %.2f%n", perimetro);
        System.out.printf("Diagonal: %.2f%n", diagonal);

    }
}
