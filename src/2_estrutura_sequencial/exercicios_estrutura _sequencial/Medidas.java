/*
 * Problema "medidas" 
 * Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e mostrar (imprimir os dados 
 * com quatro casas decimais): 
 * a) a área do quadrado que tem lado A 
 * b) a área do triângulo retângulo que base A e altura B 
 * c) a área do trapézio que tem bases A e B, e altura C 
 */

import java.util.Locale;
import java.util.Scanner;

public class Medidas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double A, B, C;

        System.out.print("Digite valor para A: ");
        A = input.nextDouble();

        System.out.print("Digite valor para B: ");
        B = input.nextDouble();

        System.out.print("Digite valor para C: ");
        C = input.nextDouble();

        System.out.printf("a) a área do quadrado que tem lado A: %.4f\n", Math.pow(A,2));
        System.out.printf("b) a área do triângulo retângulo que base A e altura B: %.4f\n", (A*B)/2);
        System.out.printf("c) a área do trapézio que tem bases A e B, e altura C: %.4f\n", (A + B)*C/2);
        
        input.close();
    }
}
