// 8)	Sabe-se que : 1 pé = 12 polegadas; 1 jarda = 3 pés; 1 milha = 1.760 jardas. Faça um programa que receba uma medida em pés, faça as conversões a seguir e mostre os resultados: a) em polegadas; b) em jardas; c) em milhas. //


import java.util.Scanner;

class ListaS8 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    float pes, polegadas, jardas, milhas;
    System.out.println("Informe a medida em pés:");
    pes = sc.nextInt();
    polegadas = pes*12;
    System.out.println("Em polegadas o valor será de:" + polegadas);
    jardas = pes/3;
    System.out.println("Em jardas o valor será de :" + jardas);
    milhas = pes/5280;
    System.out.println("Em milhas o valor será de :" + milhas);
  
  }
}