import java.util.Random;
import java.util.Scanner;

public class sprint4 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int qtdEqp, resultCombat;
        Random gera = new Random();
        System.out.println(
                "Informe a quantidade de equipes para o combate TODOS X TODOS (a caso houver empate a nota de desing do robo será usada como critério de desempate)");
        qtdEqp = key.nextInt();

        int[] qtdP = new int[qtdEqp];
        int[] qtdP1 = new int[qtdEqp];
        int[] winEqp = new int[qtdEqp];
        int[] pDesing = new int[qtdEqp];
        int[] numEquipe = new int[qtdEqp];
        for (int i = 0; i < qtdEqp; i++) {
            for (int j = i + 1; j < qtdEqp; j++) {
                qtdP[i] = gera.nextInt(1, 10);
                qtdP[j] = gera.nextInt(1, 10);
                pDesing[i] = gera.nextInt(1, 10);
                pDesing[j] = gera.nextInt(1, 10);
                System.out.println(
                        " equipe " + (numEquipe[i] = i + 1) + " fez " + qtdP[i] + " Pontos x equipe "
                                + (numEquipe[i] = j + 1) + " fez " + qtdP[i + 1]
                                + " Pontos");
                if (qtdP[i] == qtdP[i + 1]) {
                    if (pDesing[i] > pDesing[j]) {
                        qtdP[i] = qtdP[i]++;
                    } else {
                        qtdP[j] = qtdP[j]++;
                    }
                }
                if (qtdP[i] > qtdP[i + 1]) {
                    System.out.println("Equipe vencedora: " + (numEquipe[i] = (i + 1)));
                    winEqp[i] = numEquipe[i] = (i + 1);
                } else if (qtdP[i] < qtdP[i + 1]) {
                    System.out.println("Equipe vencedora: " + (numEquipe[i] = (j + 1)));
                    winEqp[i] = numEquipe[i] = (j + 1);
                }
                System.out.println("");
            }
        }
        System.out.println("Proximo combate será entre os melhores da rodada anterior: ");
        for (int i = 0; i < winEqp.length; i++) {
            for (int j = i+1; j <= winEqp.length; j++) {
                qtdP1[j] = gera.nextInt(1, 2);
                if (qtdP1[j]==1) {
                    if (pDesing[i] > pDesing[j]||pDesing[i] < pDesing[j]) {
                        qtdP1[i] = qtdP1[i]+1;
                    } else {
                        qtdP1[i+1] = qtdP1[i]+1;
                    }
                }
                System.out.println(
                        " equipe " + (winEqp[i] = i + 1) + " fez " + qtdP1[i] + " Pontos x equipe "
                                + (winEqp[i] = j + 1) + " fez " + qtdP1[i + 1]
                                + " Pontos");
            }

        }

    }
}