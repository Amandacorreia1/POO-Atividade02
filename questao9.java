/*
 * Escreva um programa Java console que leia um número de 3 dígitos e o inverta, 
 * escrevendo o número lido e o invertido. Por exemplo, se o usuário informar o valor 753,
 * seu programa deverá invertê-lo, resultando em 357. Seu programa deverá exibir a seguinte saída: 
Informe um valor inteiro de três dígitos: 753 
O valor original é: 753
O valor invertido é: 357

 */
import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Scanner informe = new Scanner(System.in);

        System.out.print("Informe um valor inteiro de três dígitos: ");
        int numero = informe.nextInt();

        if (numero >= 100 && numero <= 999) {
            int digito1 = numero % 10;
            int digito2 = (numero / 10) % 10;
            int digito3 = numero / 100;

            int numeroInvertido = digito1 * 100 + digito2 * 10 + digito3;

            System.out.println("O valor original é: " + numero);
            System.out.println("O valor invertido é: " + numeroInvertido);
        } else {
            System.out.println("O número que voce digitou nao possui 3 digitos.");
        }
         informe.close();
    }
}

