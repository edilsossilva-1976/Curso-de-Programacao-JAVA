import java.util.Locale;
import java.util.Scanner;

/*
 * Problema "duracao" 
 * Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no 
 * formato horas:minutos:segundos.
 */

public class Duracao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int segundos, minutos, horas;

        System.out.print("Digite a duração em segundos: ");
        segundos = input.nextInt();

        horas = segundos / 3600;
        minutos = (segundos % 3600)/60;
        segundos = segundos % 60;

        System.out.printf("%d:%d:%d", horas, minutos, segundos);

        input.close();
    }
}
