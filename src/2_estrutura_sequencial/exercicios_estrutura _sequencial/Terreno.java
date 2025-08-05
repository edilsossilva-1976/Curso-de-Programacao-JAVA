

/*
 * Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma 
 * casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida, 
 * o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com 
 * duas casas decimais, conforme exemplo. 
 */

package src.2_estrutura_sequencial.exercicios_estrutura _sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Terreno {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double largura, comprimento, valorM2, areaTerreno, precoTerreno;

        System.out.print("Digite a largura do terreno: ");
        largura = input.nextDouble();

        System.out.print("Digite o comprimento do terreno: ");
        comprimento = input.nextDouble();

        System.out.print("Digite o valor do M2: ");
        valorM2 = input.nextDouble();

        areaTerreno = largura * comprimento;
        precoTerreno = valorM2 * areaTerreno;

        System.out.printf("Área do terreno: %f%n", areaTerreno);
        System.out.printf("Preço do terreno: %f%n", precoTerreno);
        
    }

}
