
/*
 * Problema "troco" 
 * Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia. 
 * O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto, 
 * e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve 
 * mostrar o valor do troco a ser devolvido ao cliente. 
 */

import java.util.Locale;
import java.util.Scanner;

public class Troco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double precoUnitario, valorPagoCliente, valorTroco;
        int quantidadeProduto;
        
        System.out.println("***** MERCEARIA DEV SUPERIOR *****");
        System.out.print("Preço unitario do produto:");
        precoUnitario = input.nextDouble();
        
        System.out.print("Quantidade comprada:");
        quantidadeProduto = input.nextInt();
        
        System.out.print("Valor recebido (em cash):");
        valorPagoCliente = input.nextDouble();
        
        valorTroco = valorPagoCliente - (precoUnitario * quantidadeProduto);
        
        System.out.printf("TROCO: R$ %.2f%n", valorTroco);
        
        input.close();

    }
}
