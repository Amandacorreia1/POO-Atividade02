// Elabore um programa que leia um número (1 a 9) e imprima a tabuada desse número.

import java.util.Scanner;

public class questao {
    public static void main(String[] args) {
        Scanner informe = new Scanner(System.in);

        int a, resultado;
        System.out.print("Digite o valor: ");
        a = informe.nextInt();


        System.out.printf("\t\t\t  Tabuada");

        for(int i = 1; i<=9; i++){
            resultado = i * a;
            System.out.printf("\n \t\t\t %d * %d = %d" , i, a, resultado);


        }
         informe.close();
            
        }
        

        
    }


