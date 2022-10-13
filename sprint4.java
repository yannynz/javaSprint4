import java.util.Random;
import java.util.Scanner;

public class sprint4 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int qtdEqp, auxMa, auxMe;
        Random gera = new Random();

        System.out.println("Informe a quantidade de equipes para o combate TODOS X TODOS");
        qtdEqp=key.nextInt();

        int[]numEqp=new int[qtdEqp];
        int[]qtdP=new int[qtdEqp];
        for (int i = 0; i < qtdEqp; i++) {
            numEqp[i]=(i+1);
            qtdP[i]=gera.nextInt(1,10);
            System.out.println("equipe "+(numEqp[i])+" obteve "+ qtdP[i]+" pontos no primeiro combate");
        }
       for (int i = 0; i < qtdP[i]; i++) {
        if (qtdP[i]>qtdP[i+1]||qtdP[i+1]>qtdP[i]) {
            System.out.println("Em "+(i+1)+"° Lugar equipe "+(numEqp[i])+" com "+qtdP[i]+" Pontos");
        }
       }



    }
}