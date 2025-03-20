package Atividades;

import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double delta, x1, x2, a , b, c;

        System.out.println("Digite o valor de a: ");
        a = scan.nextDouble();
        System.out.println("Digite o valor de b: ");
        b = scan.nextDouble();
        System.out.println("Digite o valor de c: ");
        c = scan.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        if(delta < 0){
            System.out.println("Não existem raízes reais para a equação");
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        }

        //x = -b ± √(b² – 4ac)/ 2a
    }
}
