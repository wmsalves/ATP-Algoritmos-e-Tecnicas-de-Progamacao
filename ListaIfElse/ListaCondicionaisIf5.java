// 5) Faça um programa que receba um número inteiro e verifique se é par ou ímpar. //

import java.util.Scanner;

public class ListaCondicionaisIf5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Informe um número");
        num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println("O número é par");
        else
            System.out.println("O número é impar");
    }
}
