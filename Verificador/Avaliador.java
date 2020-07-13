package Verificador;

import java.util.Locale;
import java.util.Scanner;

public class Avaliador {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        float n1, n2, n3, n4 = 0;
        double media = 0;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.print("Nota do primeiro bimestre: ");
        n1 = sc.nextFloat();

        System.out.print("Nota do segundo bimestre: ");
        n2 = sc.nextFloat();

        System.out.print("Nota do terceiro bimestre: ");
        n3 = sc.nextFloat();

        System.out.print("Nota do quarto bimestre: ");
        n4 = sc.nextFloat();

        media = (n1 + n2 + n3 + n4) / 4;
        
        if (media >= 7) {
            System.out.printf("Parabéns " + media,"%.2f%n");
        }else if (media <= 6.5) {
            System.out.printf("Observações a serem feitas " + media, "%.2f%n");
        }else {
            System.out.printf("Mais sorte na proxima vez " + media, "%.2f%n");
        }

        sc.close();
    }
}