import java.util.Scanner;

// Escreva um programa que solicite ao usuário a altura e o raio de um cilindro circular e imprima o volume do cilindro. O volume de um cilindro circular é calculado por meio da seguinte fórmula: vol = pi * raio*raio*altura //

public class Atividade1 
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double altura, raio, volume;
    double pi = 3.14;

    System.out.println("Informe a altura do cilindro :");
    altura = sc.nextInt();
    System.out.println("Informe o valor do raio");
    raio = sc.nextInt();
    System.out.println("Sabendo que o volume é calculado através da formula: volume = pi * raio² * altura, informe novamente o valor do raio para assim calcular o volume");
    volume = pi*raio*raio*altura;
    System.out.println(" O volume do cilindro é " + pi + " * " + raio + " * " + raio + " * " + altura + " = " + volume);
  }
}

