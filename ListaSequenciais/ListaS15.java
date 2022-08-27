// 15)	Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. Faça um programa que receba o valor do salário mínimo e a quantidade de quilowatts consumida por uma residência, calcule e mostre:	O valor de cada quilowatt;	O valor a ser pago por essa residência;	O valor a ser pago com desconto de 15%. //

import java.util.Scanner;

class ListaS15 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    double salariomin, qtdconsu, valorqw, valorf, desc;

    System.out.println("Informe o valor do salário do mínimo: ");
    salariomin = sc.nextInt();
    System.out.println("Informe a quantidade de quilowatt da residência: ");
    qtdconsu = sc.nextInt();
    valorqw = salariomin/500;
    valorf = valorqw*qtdconsu;
    desc = valorf-(valorf*15)/100;
    System.out.println("Cada quilowatt consumido sera cobrado: R$" + valorqw);
    System.out.println("O valor total da conta será de: R$" + valorf);
    System.out.println("Aplicando o desconto de 15%, o valor final será de: R$"+desc);

  }
}