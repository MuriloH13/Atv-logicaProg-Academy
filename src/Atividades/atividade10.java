package Atividades;

import java.util.Arrays;
import java.util.Scanner;

public class atividade10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int x = scan.nextInt();
        int[] numeros = new int[x];

        System.out.println("Digite os números: ");
        for (int i = 0; i < x; i++) {
            numeros[i] = scan.nextInt();
        }

        Arrays.sort(numeros);

        int soma = 0, somaPares = 0, somaImpares = 0;
        for (int num : numeros) {
            soma += num;
            if (num % 2 == 0) {
                somaPares += num;
            } else {
                somaImpares += num;
            }
        }

        System.out.println("Números em ordem crescente: " + Arrays.toString(numeros));
        System.out.print("Números em ordem decrescente: [");
        for (int i = x - 1; i >= 0; i--) {
            System.out.print(numeros[i] + (i == 0 ? "" : ", "));
        }
        System.out.println("]");
        System.out.println("Maior número: " + numeros[x - 1]);
        System.out.println("Menor número: " + numeros[0]);
        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + (double) soma / x);
        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);

        scan.close();
    }
}