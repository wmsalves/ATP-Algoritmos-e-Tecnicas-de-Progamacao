// 2) Faça um programa que leia três números reais representando os lados de um triângulo e informe se seu triângulo é Equilátero, Isósceles ou Escaleno. //

import java.util.Scanner;

public class ListaCondicionaisIf2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int lado1, lado2, lado3;

    System.out.println("Informe o primeiro número: ");
    lado1 = sc.nextInt();
    System.out.println("Informe o segundo número: ");
    lado2 = sc.nextInt();
    System.out.println("Informe o terceiro número: ");
    lado3 = sc.nextInt();

    if (lado1 == lado2 && lado1 == lado3) {
      System.out.println("Triangulo Equilatero");
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 != lado3) {
      System.out.println("Triangulo Isosceles");
    } else if (lado1 != lado2 || lado1 != lado3 || lado2 != lado3) {
      System.out.println("Triângulo Escaleno");
    }
  }
}
