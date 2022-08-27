// 7)	Faça um programa que receba um número positivo e maior que zero, calcule e mostre: O número digitado ao quadrado;	O número digitado ao cubo; A raiz quadrada do número digitado; A raiz cúbica do número digitado. //

import java.util.Scanner;

class ListaS7 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    double num, quad, cub, raizq, raizc;

    System.out.println("Digite um número maior que zero:");
    num = sc.nextInt();
    quad = Math.pow(num, 2);
    System.out.println("O numero ao quadradado:" +quad);
    cub = Math.pow(num, 3);
    System.out.println("O numero ao cubo:" +cub);
    raizq = Math.sqrt(num);
    System.out.println("A raiz quadrada do numero digitado é:" +raizq);
    raizc = Math.cbrt(num);
    System.out.println("A raiz cúbica do numero digitado é:" +raizc);
    
    }
}
