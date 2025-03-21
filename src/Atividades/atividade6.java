package Atividades;

import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Informe o cateto adjacente: ");
        double ca = scan.nextDouble();

        System.out.println("Informe o cateto oposto: ");
        double co = scan.nextDouble();

        double hipo = Math.sqrt( Math.pow(ca, 2) + Math.pow(co, 2));

        System.out.println("A hipotenusa destes número é: " + hipo);
    }
}
