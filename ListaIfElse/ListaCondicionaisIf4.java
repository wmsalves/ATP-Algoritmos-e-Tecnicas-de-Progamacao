// 4) Faça um programa que receba três números e mostre-os em ordem crescente. Suponha que o usuário digite três números diferentes. //

import java.util.Scanner;

public class ListaCondicionaisIf4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        num3 = sc.nextInt();

        if (num1 < num2 && num2 < num3) {

            System.out.println(num1 + " - " + num2 + " - " + num3);
        } else if (num1 < num3 && num3 < num2) {
            System.out.println(num1 + " - " + num3 + " - " + num2);
        } else if (num2 < num1 && num1 < num3) {
            System.out.println(num2 + " - " + num1 + " - " + num3);
        } else if (num2 < num3 && num3 < num1) {
            System.out.println(num2 + " - " + num3 + " - " + num1);
        } else if (num3 < num2 && num2 < num1) {
            System.out.println(num3 + " - " + num2 + " - " + num1);
        } else if (num3 < num1 && num1 < num2) {
            System.out.println(num3 + " - " + num1 + " - " + num2);
        }
    }
}