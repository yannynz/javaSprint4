import java.util.Random;
import java.util.Scanner;

public class sprint4 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int qtdEqp;
        Random gera = new Random();
        Random gera2 = new Random();

        System.out.println("Informe a quantidade de equipes para o combate TODOS X TODOS (a caso houver empate a nota de desing do robo será usada como critério de desempate)");
        qtdEqp = key.nextInt();

        int[] qtdP = new int[qtdEqp];
        int[] pDesing = new int[qtdEqp];

        for (int i = 0; i < qtdEqp; i++) {
            for (int j = i + 1; j < qtdEqp; j++) {
                qtdP[i] = gera.nextInt(1, 10);
                qtdP[j] = gera.nextInt(1, 10);
                System.out.println(
                        " equipe " + (i + 1) + " fez " + qtdP[i] + " Pontos x equipe " + (j + 1) + " fez "+qtdP[j]+" Pontos");
                System.out.println("");
                if (qtdP[i] == qtdP[j]) {
                    for(int k=0; k<2;k++){
                    pDesing[i]=gera.nextInt(1,10);
                    if (pDesing[i]>pDesing[i+1]) {
                        qtdP[i]+=1;
                    }else{
                        qtdP[j]+=1;
                    }
                }
                }
            }
        }

    }
}