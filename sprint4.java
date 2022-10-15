import java.util.Random;
import java.util.Scanner;

public class sprint4 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int qtdEqp;
        Random gera = new Random();
        System.out.println(
                "Informe a quantidade de equipes para o combate TODOS X TODOS (a caso houver empate a nota de desing do robo será usada como critério de desempate)");
        qtdEqp = key.nextInt();

        int[] qtdP = new int[qtdEqp];
        int[] winEqp = new int[qtdEqp];
        int[] pDesing = new int[qtdEqp];
        int[] numEquipe = new int[qtdEqp];
        int[] cont = new int[qtdEqp];

        for (int i = 0; i < qtdEqp; i++) {
            for (int j = i + 1; j < qtdEqp; j++) {
                qtdP[i] = gera.nextInt(1, 10);
                qtdP[j] = gera.nextInt(1, 10);
                pDesing[i] = gera.nextInt(1, 1000);
                pDesing[j] = gera.nextInt(1, 1000);
                System.out.println(" equipe " + (numEquipe[i] = i + 1) + " fez " + qtdP[i] + " Pontos x equipe "
                                + (numEquipe[i] = j + 1) + " fez " + qtdP[j]
                                + " Pontos");
                if (qtdP[i] == qtdP[j]) {
                    if (pDesing[i] > pDesing[i+1]) {
                        qtdP[i] = qtdP[i]+1;
                    } else {
                        qtdP[j] = qtdP[j]+1;
                    }
                }
                if (qtdP[i] > qtdP[j]) {
                    System.out.println("Equipe vencedora: " + (numEquipe[i] = (i + 1)));
                   
                        winEqp[i] = numEquipe[i] = (i + 1);
                        cont[i]=(i+1);
                    
                } else if (qtdP[i] < qtdP[j]) {
                    System.out.println("Equipe vencedora: " + (numEquipe[i] = (j + 1)));
                        winEqp[i] = numEquipe[i] = (j + 1);
                        cont[i]=(i+1);
                    
                }
                System.out.println("");
            }
        }
        System.out.println("Proximo combate será entre: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(winEqp[i]);
        }
        
        
// ta incompleto professor, desculpa, tenha compaixão por favor. 
        
                

    }
}