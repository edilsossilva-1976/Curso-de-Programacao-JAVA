/*
 * Problema "pagamento" 
 * Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e a 
 * quantidade de horas trabalhadas por ele(a). Ao final, mostrar o valor do pagamento do funcionário com 
 * uma mensagem explicativa, conforme exemplo
 */

 import java.util.Locale;
import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        String nome;
        double valorHora, valorPagamento;
        int horasTrabalhadas;
        
        System.out.println(" *** CALCULADORA - PAGAMENTO ***");
        System.out.print("Digite o nome: ");
        nome = input.nextLine();
        
        System.out.print("Valor por Hora: ");
        valorHora = input.nextDouble();
        input.nextLine();
        
        System.out.print("Horas Trabalhadas: ");
        horasTrabalhadas = input.nextInt();
        input.nextLine();
        
        valorPagamento = valorHora * horasTrabalhadas;
        
        System.out.printf("O pagamento para %s deve ser R$ %.2f\n", nome, valorPagamento);
        
        input.close();

    }
}
