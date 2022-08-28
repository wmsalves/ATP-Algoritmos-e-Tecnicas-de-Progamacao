//6) Faça um programa que receba o código correspondente ao cargo de um funcionário e seu salário atual e mostre o cargo, o valor do aumento e seu novo salário. Os cargos estão na tabela abaixo. 1	Escriturário	50%, 2	Secretário	35%, 3	Caixa	20%, 4	Gerente	10%, 5	Diretor	Não tem aumento//

import java.util.Scanner;

class ListaCondicionaisIf6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codg, salario;
        double aumento;

        System.out.println("Informe o número do seu cargo: ");
        codg = sc.nextInt();
        System.out.println("Informe o seu salário atual: ");
        salario = sc.nextInt();

        if (codg == 1) {
            System.out.println("O cargo escolhido foi: Escriturário");
            aumento = salario * 0.5;
            System.out.println("O valor do aumento será de: " + aumento);
            System.out.println("E o salario final será de: " + (aumento + salario));
        }
        if (codg == 2) {
            System.out.println("O cargo escolhido foi: Secretarário");
            aumento = salario * 0.35;
            System.out.println("O valor do aumento será de: " + aumento);
            System.out.println("E o salario final será de: " + (aumento + salario));
        }
        if (codg == 3) {
            System.out.println("O cargo escolhido foi: Caixa");
            aumento = salario * 0.20;
            System.out.println("O valor do aumento será de: " + aumento);
            System.out.println("E o salario final será de: " + (aumento + salario));
        }
        if (codg == 4) {
            System.out.println("O cargo escolhido foi: Gerente");
            aumento = salario * 0.10;
            System.out.println("O valor do aumento será de: " + aumento);
            System.out.println("E o salario final será de: " + (aumento + salario));
        }
        if (codg == 5) {
            System.out.println("Infelizmente você nao receberá nenhum aumento");
            System.out.println("Então o salário final será de: " + salario);
        }
        if (codg >= 6) {
            System.out.println("Não existe cargo com o código informado");
        }
    }
}
