// 1)	Faça um programa que receba três notas e seus respectivos pesos, calcule e mostre a média ponderada dessas notas.//

import java.util.Scanner;

class ListaS1 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int n1, n2, n3, p1, p2, p3, somap, media, mediaf;
    
    System.out.println("Digite a primeira nota:");
    n1 = sc.nextInt();
    System.out.println("Digite o peso da primeira nota:");
    p1 = sc.nextInt();
    System.out.println("Digite a segunda nota:");
    n2 = sc.nextInt();
    System.out.println("Digite o peso da segunda nota:");
    p2 = sc.nextInt();
    System.out.println("Digite a terceira nota:");
    n3 = sc.nextInt();
    System.out.println("Digite o peso da terceira nota:");
    p3 = sc.nextInt();
    somap = p1+p2+p3;
    System.out.println("A soma dos três pesos é de: " + somap);
    media = (n1*p1)+(n2*p2)+(n3*p3);
    mediaf = media/somap;
    System.out.println("A média ponderada é de: " + media + " / " + somap + " = " + mediaf);
    
    }
}