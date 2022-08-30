import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        double salario, imposto = 0, salarion;

        System.out.println("Informe o seu salário: ");
        salario = sc.nextInt();
        System.out.println("Dentre as opções a seguir, selecione apenas uma: 1 - Imposto, 2 - Novo Salario, 3 - Classificação.");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                if (salario < 500) {
                    imposto = salario * 0.05;
                    System.out.println("Valor de Imposto: R$" + imposto);
                } else if (salario >= 500 && salario <= 850) {
                    imposto = salario * 0.10;
                    System.out.println("Valor de Imposto: R$" + imposto);
                } else if (salario > 850) {
                    imposto = salario * 0.15;
                    System.out.println("Valor de Imposto: R$" + imposto);
                }
                break;
            case 2:
                if (salario > 1500) {
                    salarion = 25 + salario;
                    System.out.println("Novo salario: R$" + salarion);
                } else if (salario >= 750 && salario <= 1500) {
                    salarion = 50 + salario;
                    System.out.println("Novo salario: R$" + salarion);
                } else if (salario >= 450 && salario < 750) {
                    salarion = 75 + salario;
                    System.out.println("Novo salario: R$" + salarion);
                } else if (salario < 450) {
                    salarion = 100 + salario;
                    System.out.println("Novo salario: R$" + salarion);
                }
                break;
            case 3:
                if (salario <= 700) {
                    System.out.println("Mal remunerado !");
                } else if (salario > 700) {
                    System.out.println("Bem remunerado !");
                }
                break;

            default:
                System.out.println("Opção Inválida.");
                break;
        }
    }
}