package Atividades;

import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer[] vet = new Integer[5];

        for (int i = 0; i < vet.length; i++) {
            System.out.println("informe um número:");
            vet[i] = scan.nextInt();
        }
        for (int i = 0; i < vet.length; i++) {
            if(vet[i]%2!=0){
                System.out.println(vet[i]);
            }
        }

    }
}
