// 10)	O custo ao consumidor de um carro novo é a soma do preço de fábrica com o percentual de lucro do distribuidor e dos impostos aplicados ao preço de fábrica. Faça um programa que receba o preço de fábrica de um veículo, o percentual de lucro do distribuidor e o percentual de impostos, calcule e mostre:	O valor correspondente ao lucro do distribuidor;	O valor correspondente aos impostos;	O preço final do veículo //

import java.util.Scanner;

class ListaS10 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int precofab, perclucro, percimp, precof, valorimp, valorluc;

    System.out.println("Digite o preço de fábrica do seu automóvel:");
    precofab = sc.nextInt();
    System.out.println("Informe o percentual de lucro:");
    perclucro = sc.nextInt();
    System.out.println("Informe o percentual de imposto:");
    percimp = sc.nextInt();
    valorluc = precofab*perclucro/100;
    valorimp = precofab*percimp/100;
    precof = precofab+valorluc+valorimp;
    System.out.println("O valor do lucro do distribuidor é:" + valorluc);
    System.out.println("O valor correspondenten aos impostos é:" + valorimp);
    System.out.println("O preço final do veículo será de:" + precof);
  }
}