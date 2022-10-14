import java.util.Random;
import java.util.Scanner;

public class sprint4 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int qtdEqp, aux, aux1, aux2;
        Random gera = new Random();
        Random gera2 = new Random();

        System.out.println(
                "Informe a quantidade de equipes para o combate TODOS X TODOS (a caso houver empate a nota de desing do robo será usada como critério de desempate)");
        qtdEqp = key.nextInt();

        int[] qtdP = new int[qtdEqp];
        int[] pDesing = new int[qtdEqp];
        int[] numEquipe = new int[qtdEqp];
        for (int i = 0; i < qtdEqp; i++) {
            for (int j = i + 1; j < qtdEqp; j++) {
                qtdP[i] = gera.nextInt(1, 10);
                qtdP[j] = gera.nextInt(1, 10);
                System.out.println(
                        " equipe " + (numEquipe[i] = i + 1) + " fez " + qtdP[i] + " Pontos x equipe "
                                + (numEquipe[i] = j + 1) + " fez " + qtdP[j]
                                + " Pontos");
                System.out.println("");
                pDesing[i] = gera.nextInt(1, 10);
                if (pDesing[i] > pDesing[i + 1]) {
                    qtdP[i] += 1;
                } else {
                    qtdP[j] += 1;
                }
            }
        }

        for (int j = 1; j <= qtdP.length; j++) {
            for (int i = 0; i < qtdP.length - 1; i++) {
                if (qtdP[i] < qtdP[i + 1] || pDesing[i] < pDesing[i + 1] && qtdP[i] == qtdP[i + 1]) {
                    aux = qtdP[i];
                    qtdP[i] = qtdP[i + 1];
                    qtdP[i + 1] = aux;

                    aux1 = pDesing[i];
                    pDesing[i] = pDesing[i + 1];
                    pDesing[i + 1] = aux1;

                    aux2 = numEquipe[i];
                    numEquipe[i] = numEquipe[i + 1];
                    numEquipe[i + 1] = aux2;
                }
            }
        }
        System.out.println("\n Ranking: (Em caso de empate, a nota de design do robô será quesito de desempate) ");
        System.out.println();
        for (int i = 0; i < qtdP.length; i++) {
            System.out.println("#" + (i + 1) + " equipe: " + numEquipe[i] + " | Pontos de Combate: " + qtdP[i]
                    + " | Nota de design: " + pDesing[i]);
        }

    }
}