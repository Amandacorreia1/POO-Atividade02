/*
 * Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem,
 *  utilizando um automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário
 *  deve fornecer o tempo gasto na viagem e a velocidade média. Desta forma, será possível 
 * obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE. Tendo o valor
 *  da distância, basta calcular a quantidade de litros de combustível utilizada na viagem
 *  com a fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da
 *  velocidade média, tempo gasto, a distância percorrida e a quantidade de litros utilizada n
 * a viagem. Dica: trabalhe com valores reais.
 */

import java.util.Scanner;
public class questao3 {
    public static void main(String[] args){
        Scanner viagem = new Scanner(System.in);
       
        System.out.printf("Digite o tempo gasto na viagem: ");
        double tempo = viagem.nextDouble();

        System.out.printf("Digite a velocidade media durante a viagem: ");
        double velocidade = viagem.nextDouble();

        double distancia = tempo * velocidade;

        Double listros_usados = distancia / 12;
        
        System.out.printf("\n\n");
        System.out.printf("Tempo gasto: %.2f\n", tempo);
        System.out.printf("Velocidade media: %.2f\n", velocidade);
        System.out.printf("Distancia percorrida = %.2f km\n", distancia);
        System.out.printf("Quantidade de litros de combustiveis utilizados na viagem: %.2f litros\n", listros_usados);

        viagem.close();
    }
   
}
