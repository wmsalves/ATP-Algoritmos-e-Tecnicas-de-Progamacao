// 9)	Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre:	a idade dessa pessoa;	quantos anos ela terá em 2050 //


import java.util.Scanner;

class ListaS9 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int nasc, anoatual, idadeatual, ano2050;

    System.out.println("Informe o ano de nascimento:");
    nasc = sc.nextInt();
    System.out.println("Informe o ano atual:");
    anoatual = sc.nextInt();
    idadeatual = anoatual-nasc;
    System.out.println("Idade: " + idadeatual);
    ano2050 = 2050-nasc;
    System.out.println("Idade em 2050: " + ano2050);

    
  }
}