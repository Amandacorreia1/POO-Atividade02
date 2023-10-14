/*
 * Escreva um programa Java console que receberá a duração de um evento expresso em 
 * segundos e exiba-o expresso em horas, minutos e segundos. Seu programa deverá 
 * exibir uma saída parecida com:
Informe a duração do evento em segundos: 3712 
Duração do evento: 01:01:52

 */
import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner informe = new Scanner(System.in);

        System.out.print("Informe a duração do evento em segundos: ");
        int segundos = informe.nextInt();
        informe.close();

        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;

       
        String formatoHora = String.format("%02d:%02d:%02d", horas, minutos, segundosRestantes);

        System.out.println("Duração do evento: " + formatoHora);
    }
}

