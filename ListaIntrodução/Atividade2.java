import java.util.Scanner;

//Uma empresa contrata um encanador a R$20,00 por dia. Crie um programa que solicite o número de dias trabalhados pelo encanador e imprima a quantia líquida que deverá ser paga, sabendo-se que são descontados 8% de impostos //

public class Atividade2 {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int diast, valors;
    double valorf, valorl, salario = 20.00, desconto = 8.0 / 100.0;

    System.out.println("Quantos dias foram trabalhados? ");
    diast = sc.nextInt();
    valors = diast*20;
    System.out.println("O salário será de " + diast + " * "+ salario + " = " + valors);
    valorf = valors * (8.0 / 100.0);
    System.out.println("Aplicando o desconto de 8% referente aos impostos, o valor de desconto será de " + valors + " * " + desconto + " = " + valorf);
    valorl = valors-valorf;
    System.out.println("Logo o valor final a ser recebido será de " + valors + " - " + valorf + " = " + valorl);
    }
}

