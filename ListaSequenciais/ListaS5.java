// 5)	Faça um programa que calcule e mostre a área de um triângulo. area = (base * altura)/2 //

import java.util.Scanner;

class ListaS5 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int base, altura, area;

    System.out.println("Informe a base do triângulo:");
    base = sc.nextInt();
    System.out.println("Informe a altura do triângulo:");
    altura = sc.nextInt();
    area = (base*altura)/2;
    System.out.println("A area do triângulo será de:"+ area);

  }
}