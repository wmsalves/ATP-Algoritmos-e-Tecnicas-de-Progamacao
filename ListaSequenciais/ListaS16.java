// 16)	Faça um programa que receba o custo de um espetáculo teatral e o preço do convite desse espetáculo. Esse programa deverá calcular e mostrar a quantidade de convites que devem ser vendidos para que pelo menos o custo do espetáculo seja alcançado. //

import java.util.Scanner;

class ListaS16 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);

    float custoe, custoc, qtd, qtdc;

    System.out.println("Informe o custo do espetáculo teatral: ");
    custoe = sc.nextInt();
    System.out.println("Informe o valor de cada convite: ");
    custoc = sc.nextInt();
    qtdc = custoe/custoc;
    System.out.println("Para atingir o custo do espetáculo, devem ser vendido " + qtdc + " convites");

  }
}