// 3)	Faça um programa que receba o salário de um funcionário e o percentual de aumento, calcule e mostre o valor do aumento e o novo salário. //

import java.util.Scanner;

class ListaS3 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int salario;
    double aumento, salariof;

    System.out.println("Informe o seu salário:");
    salario = sc.nextInt();
    System.out.println("Informe o aumento em porcentagem:");
    aumento = sc.nextInt();
    salariof =  (salario*(aumento/100))+salario;
    System.out.println("O salario final junto com o aumento é de: " + salariof);
    }
}