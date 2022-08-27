// 2)	Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%. //


import java.util.Scanner;

class ListaS2 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int salario;
    double soma;

    System.out.println("Informe o salário:");
    salario = sc.nextInt();
    soma = (salario*0.25) + salario;
    System.out.println("Sabendo que houve um aumento de 25%, o valor do salário será de: " + soma);
    
    }
}