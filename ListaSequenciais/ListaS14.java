//14)	Cada degrau de uma escala tem X de altura. Faça um programa que receba essa altura e a altura que o usuário deseja alcançar subindo a escada, calcule e mostre quantos degraus ele deverá subir para atingir seu objetivo, sem se preocupar com a altura do usuário. Todas as medidas fornecidas devem estar em metros //


import java.util.Scanner;

class ListaS14 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    
    float alturadeg, alturades, qtdeg;

    System.out.println("Informe a altura do degrau: ");
    alturadeg = sc.nextInt();
    System.out.println("Informe a altura que deseja subir com a escada ");
    alturades = sc.nextInt();
    System.out.println("Para atingir a altura de " + alturades + " será necessario:");
    qtdeg = alturades/alturadeg;
    System.out.println( +qtdeg + " degraus de " + alturadeg);
  
  }
}