//Crie um vetor de tamanho 50 e preencha com valores aleatórios entre 1 e 10

import java.util.Random;
import java.util.Scanner;

public class vetor {
    public static final int TAM = 50; 
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int[] num = new int[TAM];
        System.out.println("Vetor  de  tamanho 50 com valores Aleatórios entre 1 e 10 ");
        preencher(num);

        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
    }

    public static void preencher(int vetor[]) {
        Random NumAleatorio = new Random();
        for (int i = 0; i < TAM; ++i) {
            vetor[i] = NumAleatorio.nextInt(10) + 1;
        }
    }

}
