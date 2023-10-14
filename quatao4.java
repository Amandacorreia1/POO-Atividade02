/*
 * Faça um programa que:
  - Leia a cotação do dólar
  - Leia um valor em dólares
  - Converta esse valor para Real
  - Mostre o resultado

 */
import java.util.Scanner;

public class quatao4 {
    public static void main(String[] args) {
        
    Scanner informe = new Scanner(System.in);
    System.out.println("Qual a cotacao do dolar?");
    double cotacao = informe.nextDouble();

    System.out.println("Digite o valor em dolar: ");
    double dolar = informe.nextDouble();

    double real = dolar * cotacao;

    System.out.printf("O valor %.2f em dolar correponde a %.2f em reais." , dolar, real);


    informe.close();

    }
}
    

