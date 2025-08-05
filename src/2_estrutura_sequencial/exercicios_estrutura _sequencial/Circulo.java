/*
 * Problema "circulo" 
 * Fazer um programa para ler o valor "r" do raio de um círculo, e depois mostrar o valor da área do 
 * círculo com três casas decimais. A fórmula da área do círculo é a seguinte: 𝑎𝑟𝑒𝑎 = 𝜋. 𝑟ଶ
 * Você pode  usar o valor de 𝜋 fornecido pela biblioteca da sua linguagem de programação, ou então, se preferir, use 
 * diretamente o valor 3.14159. 
 */

 import java.util.Locale;
 import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double raio, areaCirculo;
        
        System.out.println(" *** CALCULADORA - AREA DO CIRCULO ***");
        System.out.print("Digite o valor de Raio: ");
        raio = input.nextDouble();
        
        areaCirculo = Math.PI * Math.pow(raio,2);
        
        System.out.printf("AREA: %.3f\n", areaCirculo);
        
        input.close();
    }
}
