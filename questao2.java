/*
 * Ler uma temperatura em graus Celsius e apresentá-la convertida em
 *  graus Fahrenheit. A fórmula de conversão de temperatura a ser utilizada
 *  é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura
 *  em graus Fahrenheit e a variável C representa a temperatura em graus Celsius.
 */

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args){
        Scanner informe = new Scanner(System.in);
        double c, f;
        System.out.print("Digite a temperatura em gruas celsius para converter em Fahrenheit: ");
        c = informe.nextDouble();

        f = (9 * c + 160) / 5;

        System.out.printf("O valor %.2f em fahrenheit eh = %.2f", c, f);

    informe.close();
    }   
}
