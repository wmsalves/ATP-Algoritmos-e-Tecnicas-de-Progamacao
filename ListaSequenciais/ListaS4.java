// 4)	Faça um programa que receba o valor de um depósito e o valor da taxa de juros, calcule e mostre o valor do rendimento e o valor total depois do rendimento. //

import java.util.Scanner;

class ListaS4 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int valorD, valorJ, valorR, valorF;

    System.out.println("Informe o valor de deposito: ");
    valorD = sc.nextInt();
    System.out.println("Informe o juros em porcentagem:");
    valorJ = sc.nextInt();
    valorR = valorD*valorJ/100;
    System.out.println("Fazendo os calculos, o valor irá render:" + valorR);
    valorF = valorD+valorR;
    System.out.println("E o valor total após o rendimento será:" + valorF);
  }
}