package Atividades;

import java.util.Scanner;

public class atividade8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        Integer num = scan.nextInt();
        Integer numExibido = num;

        for(int i = 1; i <= 9; i++){
            num = numExibido * i;

            System.out.println(numExibido + " X " + i + " = " + num);

        }
    }
}
