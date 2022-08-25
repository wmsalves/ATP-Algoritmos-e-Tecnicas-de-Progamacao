import java.util.Scanner;

//O cardápio de uma lanchonete é dado abaixo. Prepare um programa que leia a quantidade de cada item que você consumiu e calcule a conta final: Hambúrguer...... R$ 30,00,Cheeseburger.. R$ 35,50,Fritas R$20,50, Refrigerante R$10,00, Milshake R$30,00//

public class Atividade3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int qtd;
	  double pagar1, pagar2, pagar3, pagar4, pagar5, valorf;

	  System.out.print("Quantos hamburguers foram comprados ?");
    qtd = sc.nextInt(); 
    pagar1 = 30.00 * qtd;
    System.out.print("Quantos cheeseguers foram comprados ?" );
    qtd = sc.nextInt(); 
    pagar2 = 35.50 * qtd;
    System.out.print("Quantas fritas foram compradas ?" );
    qtd = sc.nextInt(); 
    pagar3 = 20.50 * qtd;
    System.out.print("Quantos refrigerantes foram comprados ?" );
    qtd = sc.nextInt();
    pagar4 = 10.00 * qtd;
    System.out.print("Quantos milkshakes foram comprados ?" );
    qtd = sc.nextInt(); 
    pagar5 = 30.00 * qtd;
    System.out.print("A soma dos produtos comprados: " + pagar1 + " + " + pagar2 + " + " + pagar3 + " + " + pagar4 + " + " + pagar5);
    valorf = pagar1 + pagar2 + pagar3 + pagar4 + pagar5;
    System.out.print(" e o valor total dos produtos consumidos será de: " + valorf);
  }   
}
