/*
 * 
Escreva um programa Java console que lê um valor inteiro e simule o comportamento de um caixa
 eletrônico, ou seja, calcule qual o menor número possível de notas de 100, 50, 10, 5 e 1 em 
 que o valor a ser sacado pode ser decomposto. Seu programa deverá exibir uma saída parecida com: 
Informe o valor do saque (valor inteiro): 139 
O valor do saque pode ser expresso em: 
1 notas de 100 
0 notas de 50 
3 notas de 10 
1 notas de 5 
4 notas de 1 
 */

import java.util.Scanner;
public class questao7 {
    public static void main(String[] args) {

        Scanner informe = new Scanner(System.in);
        System.out.print("Digite um valor inteiro para simular o comportamento de um caixa: ");
        int valor = informe.nextInt();

        int cem = valor / 100;
        int restoCem = valor % 100;
        
        int cinquenta = restoCem / 50;
        int restoCinquenta = restoCem % 50;

        int dez = restoCinquenta / 10;
        int restoDez = restoCinquenta % 10;
        
        int cinco = restoDez / 5;
        int um = restoDez % 5;

        System.out.println("O valor do saque pode ser expresso em: ");
        System.out.println(cem + " notas de 100");
        System.out.println(cinquenta + " notas de 50");
        System.out.println(dez + " notas de 10");
        System.out.println(cinco + " notas de 5");
        System.out.println(um + " notas de 1");

        informe.close(); 
    }
    
}
