package Atividades;

import java.util.Scanner;

public class atividade7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        Float num = scan.nextFloat();
        for(Float i = num; i > 0; i--) {
            num *= i;
        }
        System.out.println("O resultado é: " + num);


    }
}
