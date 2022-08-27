// 12)	Um trabalhador recebeu seu salário e o depositou em sua conta bancária. Esse trabalhador emitiu dois cheques e agora deseja saber seu saldo atual. Sabe-se que cada operação bancária de retirada paga CPMF de 0,38% e o saldo inicial da conta está zerado. //


import java.util.Scanner;

class ListaS12 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    double salario, chq1, chq2, saldo, cpmf1, cpmf2;

    System.out.println("Informe o salário recebido:" );
    salario = sc.nextInt();
    System.out.println("Informe o valor do primeiro cheque:" );
    chq1 = sc.nextInt();
    System.out.println("Informe o valor do segundo cheque:" );
    chq2 = sc.nextInt();
    cpmf1 = chq1*0.38/100;
    cpmf2 = chq2*0.38/100;
    saldo = salario-chq1-chq2-cpmf1-cpmf2;
    System.out.println("O valor final após a emissão dos cheques será de:" + saldo);

  }
}