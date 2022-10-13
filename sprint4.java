import java.util.Random;
import java.util.Scanner;

public class sprint4 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int qtdEqp;
        Random gera = new Random();

        System.out.println("Informe a quantidade de equipes para o combate TODOS X TODOS");
        qtdEqp=key.nextInt();

        int[]numEqp=new int[qtdEqp];
        int[]qtdP=new int[qtdEqp];
        for (int i = 0; i < qtdEqp; i++) {
            qtdP[i]=gera.nextInt(1,10);
            System.out.println("equipe "+(i+1)+" obteve "+ qtdP[i]+" pontos no primeiro combate");
        }
       for (int i = 0; i <= qtdEqp; i++) {
        if (qtdP[i]>qtdP[i+1]) {
            System.out.println("Em "+(i)+"° Lugar equipe#");
        }
       }



    }
}