/*
 * Problema "soma" 
 * Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela o valor da 
 * soma destes números
 */

import java.util.Locale;
import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int x,y, soma;
        
        System.out.println(" *** CALCULADORA ***");
        
        System.out.print("Digite o valor de X: ");
        x = input.nextInt();
        
        System.out.print("Digite o valor de Y: ");
        y = input.nextInt();
        
        soma = x + y;
        System.out.printf("SOMA: %d\n", soma);

        input.close();
    }
}
