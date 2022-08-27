// 6)	Faça um programa que calcule e mostre a área de um círculo. area = (base * altura)/2 //

import java.util.Scanner;

class ListaS6 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    double area, raio;

    System.out.println("Informe o raio do círculo:");
    raio = sc.nextInt();

    // Formula area do circulo: A = r² * pi //

    area = raio*raio*Math.PI;
    System.out.println("A area do círculo será de:"+ area);
  }
}