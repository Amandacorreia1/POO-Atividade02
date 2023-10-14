/*
 * Um hotel com 42 apartamentos resolveu fazer promoções para os fins de semana fora da alta temporada,
 *  isto é, nos meses de abril, maio, junho, agosto, setembro, outubro e novembro. A taxa da promoção
 *  é de 22% da diária normal. A ocupação média do hotel sem promoção é de 40%. A expectativa é aumentar
 *  a taxa de ocupação para 70%. Supondo que as expectativas se confirmem, escrever um algoritmo que lê a
 *  diária normal, que calcule e escreva as seguintes informações: 
(a) O valor da diária no período da promoção. 
(b) O valor médio arrecadado sem a promoção, durante um mês. 
(c) O valor médio arrecadado com a promoção, durante um mês. 
(d) O lucro ou prejuízo mensal com a promoção. 

 */
import java.util.Scanner;

public class qustao8 {
    public static void main(String[] args) {
        Scanner informe = new Scanner(System.in);

        System.out.print("Digite o valor da diária normal: ");
        double diariaNormal = informe.nextDouble();

        double taxaPromocao = 0.22;
        int numeroApartamentos = 42;
        double ocupacaoSemPromocao = 0.4; 
        double ocupacaoComPromocao = 0.7; 
        int diasMes = 30; 

        double diariaPromocao = diariaNormal * (1 - taxaPromocao);
        double arrecadadoSemPromocao = diariaNormal * numeroApartamentos * diasMes * ocupacaoSemPromocao;
        double arrecadadoComPromocao = diariaPromocao * numeroApartamentos * diasMes * ocupacaoComPromocao;
        double lucroOuPrejuizo = arrecadadoComPromocao - arrecadadoSemPromocao;

        System.out.println("O valor da diária no período da promoção: R$" + diariaPromocao);
        System.out.println("O valor médio arrecadado sem a promoção, durante um mês: R$" + arrecadadoSemPromocao);
        System.out.println("O valor médio arrecadado com a promoção, durante um mês: R$" + arrecadadoComPromocao);
        System.out.println("Lucro ou prejuízo mensal com a promoção: R$" + lucroOuPrejuizo);

        informe.close();
    }
}

