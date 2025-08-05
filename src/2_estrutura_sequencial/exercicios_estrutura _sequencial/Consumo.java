/*
 * Problema "consumo" 
 * Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de 
 * combustível gasto por este carro ao percorrer tal distância. Seu programa deve mostrar o consumo 
 * médio do carro, com três casas decimais. 
 */

import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double kmPercorrido, totalCombustivelGasto, consumoMedio;
        
        System.out.println(" ***** CALCULADORA - CONSUMO MEDIO *****");
        System.out.print("Distancia percorrida: ");
        kmPercorrido = input.nextDouble();
        
        System.out.print("Combustível gasto: ");
        totalCombustivelGasto = input.nextDouble();
        
        consumoMedio = kmPercorrido / totalCombustivelGasto;
        System.out.printf("Comsumo médio: %.3f KM/L.\n", consumoMedio);

        input.close();
    }
}
