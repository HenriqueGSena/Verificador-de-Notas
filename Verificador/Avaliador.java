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
            System.out.println("Parabens " + media);
        }else if (media <= 6.5) {
            System.out.println("Observasões a serem feitas " + media);
        }else {
            System.out.println("Mais sorte na proxima vez " + media);
        }

        sc.close();
    }
}