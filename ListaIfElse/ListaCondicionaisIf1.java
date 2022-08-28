// 1) Suponha que você está desenvolvendo um software para controle de estoque que precisa informar como está a quantidade de pacotes de uma ração A: se suficiente, para quantidades superiores a 100; em alerta, para quantidades entre 100 e 50;  e abaixo do ideal, para quantidades menores do que 50.// 

import java.util.Scanner;

public class ListaCondicionaisIf1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int qtdpac;

    System.out.println("Informe a quantidade de pacotes de ração: ");
    qtdpac = sc.nextInt();

    if (qtdpac > 100) {
      System.out.println("Quantidade de ração suficiente");
    }
    if (qtdpac >= 50 && qtdpac <= 100) {
      System.out.println("Quantidade de ração em alerta");
    }
    if (qtdpac < 50) {
      System.out.println("Quantidade de ração abaixo do ideal");
    }
  }
}