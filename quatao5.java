/*Escreva um programa Java console que solicite ao usuário que informe sua idade em anos,
 meses e dias, ou seja, sua idade atual em anos e a quantidade de meses e dias decorridos
desde seu aniversário. Seu programa deverá exibir uma saída parecida com:
Informe sua idade em anos, meses e dias 
Anos: 25 
Meses: 2
Dias: 12 
Idade expressa em dias: 9197 
Aqui o usuário tem 25 anos, 2 meses e 12 dias de idade. Assim, sua idade expressa em dias é 9.197

 * 
 */

import java.util.Scanner;
public class quatao5 {
    public static void main(String[] args) {
        Scanner informe = new Scanner(System.in);

        System.out.println("Informe sua idade atual, com a quantidade de anos, meses e dias.\n");
        System.out.println("Anos: ");
        int ano = informe.nextInt();

        System.out.println("Meses: ");
        int meses = informe.nextInt();

        System.out.println("Dia(s): ");
        int dias = informe.nextInt();

        int quantidade_dias = (ano * 365) + (meses * 30) + dias;


        System.out.printf("\n A idade pessoa corresponde a %d dias", quantidade_dias);

        informe.close();
        
    }
    
}
