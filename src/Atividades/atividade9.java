package Atividades;

import java.util.Locale;
import java.util.Scanner;

public class atividade9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("insira um texto: ");
        String texto = scan.nextLine();

        int totalVogais = contaVogais(texto);
        int totalPalavras = contaPalavras(texto);
        int totalConsoantes = contaConsoantes(texto);
        int totalLetras = contaLetras(texto);

        System.out.println("Total de vogais: " + totalVogais);
        System.out.println("Total de palavras: " + totalPalavras);
        System.out.println("Total de consoantes: " + totalConsoantes);
        System.out.println("Total de letras: " + totalLetras);
    }

    public static int contaVogais(String texto){
        int contador = 0;
        texto = texto.toLowerCase();

        for(int i = 0; i < texto.length(); i++){
            char c = texto.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                contador++;
            }
        }
        return contador;
    }

    public static int contaPalavras(String texto){
        texto = texto.trim();

        if (texto.isEmpty()) {
            return 0;
        }

        String[] palavras = texto.split("\\s+");
        return palavras.length;
    }

    public static int contaConsoantes(String texto){
        int contador = 0;
        texto = texto.toLowerCase();
        for(int i = 0; i < texto.length(); i++){
            char c = texto.charAt(i);
            if(c >= 'a' && c <= 'z' && "aeiou".indexOf(c) == -1){
                contador++;
            }
        }
        return contador;
    }

    public static int contaLetras(String texto){
        int contador = 0;
        texto = texto.toLowerCase();
        for(int i = 0; i < texto.length(); i++){
            char c = texto.charAt(i);
            if(c >= 'a'  && c <= 'z') {
                contador++;
            }
        }
        return contador;
    }

}
