package Atividades;

import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer num1, num2, resultado;

        System.out.println("Informe o primeiro numero: ");
        num1 = scan.nextInt();
        System.out.println("Informe o segundo numero: ");
        num2 = scan.nextInt();
        num1 = num1 - num2;
        resultado = Math.abs(num1 - num2);


        System.out.println(resultado);
    }
}
