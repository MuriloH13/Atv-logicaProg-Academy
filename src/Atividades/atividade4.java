package Atividades;

import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Float num1, num2;

        System.out.println("Informe o primeiro numero: ");
        num1 = scan.nextFloat();
        System.out.println("Informe o segundo numero: ");
        num2 = scan.nextFloat();
        System.out.println("O menor mmc entre " + num1 + " e " + num2 + " é: " + mmcCalc(num1, num2));

    }
    public static Float mmcCalc(Float a, Float b){
        Float maior = Math.max(a, b);
        Float mmc =  maior;

        while( mmc % a != 0 || mmc % b != 0){
            mmc++;
        }
        return mmc;
    }
}
