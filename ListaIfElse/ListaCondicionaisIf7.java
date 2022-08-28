// Faça um programa que receba o valor do salário mínimo, o número de horas trabalhadas, o número de dependentes do funcionário e a quantidade de horas extras trabalhadas. Calcule e mostre o salário a receber do funcionário de acordo com as regras a seguir:•	O valor da hora trabalhada é igual a 1/5 do salário mínimo;•	O salário do mês é igual ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada;•	Para cada dependente, acrescentar R$ 32,00;•	Para cada hora extra trabalhada, calcular o valor da hora trabalhada acrescida de 50%;•	O salário bruto é igual ao salário do mês mais o valor dos dependentes mais o valor das horas extra;•Calcular o valor do imposto de renda de acordo com a tabela a seguir:


import java.util.Scanner;

class ListaCondicionaisIf7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float df, qtdhext;
        double ht, horast, salario, salm, sald, salext, salb, sall, ir = 0, salr;

        System.out.println("Informe o valor do salário minimo: ");
        salario = sc.nextInt();
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        ht = sc.nextInt();
        System.out.println("Informe o número de dependentes: ");
        df = sc.nextInt();
        System.out.println("Informe o quantidade de horas extras trabalhadas: ");
        qtdhext = sc.nextInt();

        // O valor da hora trabalhada é igual a 1/5 do salário mínimo //
        horast = salario / 5;
        System.out.println("Valor das horas Trabalhadas: " + horast);
        // O salário do mês é igual ao número de horas trabalhadas multiplicado pelo
        // valor da hora trabalhada //
        salm = ht * horast;
        System.out.println("Salario do Mês: " + salm);
        // Para cada dependente, acrescentar R$ 32,00 //
        sald = df * 32;
        System.out.println("Valor dependentes: " + sald);
        // Para cada hora extra trabalhada, calcular o valor da hora trabalhada
        // acrescida de 50% //
        salext = qtdhext * (horast * 1.5);
        System.out.println("Valor das horas extras: " + salext);
        // O salário bruto é igual ao salário do mês mais o valor dos dependentes mais o
        // valor das horas extra //
        salb = salm + sald + salext;
        System.out.println("O salario bruto será de: " + salb);

        // Calcular o valor do imposto de renda de acordo com a tabela a seguir //
        // Isento Inferior a R$ 200,00 //
        if (salb < 200) {
            System.out.println("Isento");
        }
        // 10% De R$ 200,00 até R$ 500,00 //
        if (salb >= 200 && salb <= 500) {
            ir = salb * 0.10;
            System.out.println("Imposto de Renda (10%): " + salb * 0.10);
        }
        // 20% Superior a R$ 500,00 //
        else if (salb > 500) {
            ir = salb * 0.20;
            System.out.println("Imposto de Renda (20%): " + (salb * 0.20));
        }
        // O salário líquido é igual ao salário bruto menos o IRRF //
        sall = salb - ir;
        System.out.println("Salário Líquido: " + sall);

        // A gratificação será de acordo com a tabela a seguir //
        // Até R$ 350,00 = + R$ 100,00 //
        if (sall <= 350) {
            salr = sall + 100;
            System.out.println("Gratificação: " + (100 + sall));
        }
        // Superior a R$ 350,00 = + R$ 50,00 //
        if (sall > 350) {
            salr = sall + 50;
            System.out.println("Gratificação " + (50 + sall));
        }
    }
}
