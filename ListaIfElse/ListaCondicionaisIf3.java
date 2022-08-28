// 3) A nota final de um estudante é calculada a partir de três notas atribuídas, respectivamente, a um trabalho de laboratório, a uma avaliação semestral e a um exame final. A média das três notas mencionadas obedece aos pesos a seguir: Trabalho de laboratório	2,Avaliação semestral	3, Exame final	5. Faça um programa que receba 3 notas, calcule e mostre a média ponderada e o conceito que segue a tabela>=8   e  <=10	A, >=7   e  < 8	B, >=6   e  < 7	C, >=5   e  < 6	D, >=0   e  < 5	E //

import java.util.Scanner;

public class ListaCondicionaisIf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota1, nota2, nota3, media;

        System.out.println("Informe a primeira nota: ");
        nota1 = sc.nextInt();
        System.out.println("Informe a segunda nota: ");
        nota2 = sc.nextInt();
        System.out.println("Informe a terceira nota: ");
        nota3 = sc.nextInt();
        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 8 && media <= 10) {
            System.out.println("A media ponderada é A");
        } else if (media >= 7) {
            System.out.println("A media ponderada é B");
        } else if (media >= 6) {
            System.out.println("A media ponderada é C");
        } else if (media >= 5) {
            System.out.println("A media ponderada é D");
        } else if (media >= 0) {
            System.out.println("A media ponderada é E");
        }
    }
}