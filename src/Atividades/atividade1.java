package Atividades;

import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Float num1, num2, resultado;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = scan.nextFloat();
        System.out.print("Digite o segundo número: ");
        num2 = scan.nextFloat();
        if(num1 > num2){
            resultado = num1 /num2;
        }else {
            resultado = num2 /num1;
        }
        System.out.println("Resultado: " + resultado);
    }
}
