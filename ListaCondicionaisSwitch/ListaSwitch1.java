import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codg;
        double salario;
        double aumento;

        System.out.print("Informe o número do seu cargo: ");
        codg = sc.nextInt();
        System.out.print("Informe o seu salário atual: R$");
        salario = sc.nextInt();

        switch (codg) {
            case 1:
                System.out.println("O cargo escolhido foi: Escriturário");
                aumento = salario * 0.5;
                System.out.println("O valor do aumento será de: " + aumento);
                System.out.println("E o salario final será de: " + (aumento + salario));
                break;
            case 2:
                System.out.println("O cargo escolhido foi: Secretarário");
                aumento = salario * 0.35;
                System.out.println("O valor do aumento será de: " + aumento);
                System.out.println("E o salario final será de: " + (aumento + salario));
                break;
            case 3:
                System.out.println("O cargo escolhido foi: Caixa");
                aumento = salario * 0.20;
                System.out.println("O valor do aumento será de: " + aumento);
                System.out.println("E o salario final será de: " + (aumento + salario));
                break;
            case 4:
                System.out.println("O cargo escolhido foi: Gerente");
                aumento = salario * 0.10;
                System.out.println("O valor do aumento será de: " + aumento);
                System.out.println("E o salario final será de: " + (aumento + salario));
                break;
            case 5:
                System.out.println("Infelizmente você nao receberá nenhum aumento");
                System.out.println("Então o salário final será de: " + salario);
                break;

            default:
                System.out.println("Não existe cargo com o código informado");
        }
    }
}