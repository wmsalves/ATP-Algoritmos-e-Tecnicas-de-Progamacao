// 13)	Pedro comprou um saco de ração com peso em quilos. Ele possui dois gatos, para os quais fornece a quantidade de ração em gramas. A quantidade diária de ração fornecida para cada gato é sempre a mesma. Faça um programa que receba o peso do saco de ração e a quantidade de ração fornecida para cada gato,calcule e mostre quanto restará de ração no saco após cinco dias //


import java.util.Scanner;

class ListaS13 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);

    float pesosaco, pesodiario, resto;

    System.out.println("Informe o peso do saco em Kg: ");
    pesosaco = sc.nextInt();
    System.out.println("Informe a quantidade diaria consumida em gramas: ");
    pesodiario = sc.nextInt();
    resto = pesosaco-pesodiario*2*5/1000;
    System.out.println("Quantidade restante de ração é:" + resto);
  
  }
}