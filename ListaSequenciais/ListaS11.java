// 11)	Faça um programa que receba o número de horas trabalhadas e o valor do salário mínimo, calcule e mostre o salário a receber seguindo as regras:	A hora trabalhada vale a metade do salário mínimo;	O salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada;	O imposto equivale a 3% do salário bruto;	O salário a receber equivale ao salário bruto menos o imposto //


import java.util.Scanner;

class ListaS11 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);

    double horastrab, salariomin, horast, valorhora, salariof,imposto, salariob;
   

    System.out.println("Informe o número de horas trabalhadas: ");
    horastrab = sc.nextInt();
    System.out.println("Informe o valor total do salário mínimo: ");
    salariomin = sc.nextInt();
    horast = salariomin/2;
    System.out.println("Cada hora trabalhada vale: " + horast);
    salariob = horastrab*horast;
    System.out.println("O salário bruto vale: " + salariob);
    imposto = salariob*0.03;
    System.out.println("O imposto será de: " + imposto);
    salariof = salariob-imposto;
    System.out.println("O salário a receber será de: " + salariof);

  }
}