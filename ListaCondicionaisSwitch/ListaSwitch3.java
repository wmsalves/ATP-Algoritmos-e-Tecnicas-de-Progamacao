import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codge = 0, codgc = 0;
        double peso, preco = 0, imposto;

        System.out.println("Informe o código do estado (1 a 5): ");
        codge = sc.nextInt();
        System.out.println("Informe o peso da carga (em toneladas): ");
        peso = sc.nextInt();
        System.out.println("Informe o código da carga(10 a 40): ");
        codgc = sc.nextInt();

        System.out.println("Peso em quilogramas: " + (peso * 1000));

        if ((codgc >= 10) && (codgc <= 20)) {
            preco = peso * 1000000 * 100;
            System.out.println("Preço por grama: " + preco);
        } else if ((codgc >= 21) && (codgc <= 30)) {
            preco = peso * 1000000 * 250;
            System.out.println("Preço por grama: " + preco);
        } else if ((codgc >= 31) && (codgc <= 40)) {
            preco = peso * 1000000 * 340;
            System.out.println("Preço por grama: " + preco);
        }

        switch (codge) {
            case 1:
                System.out.println("Estado com 35% de Imposto");
                imposto = preco * 0.35;
                System.out.println("Valor Imposto: " + (imposto));
                System.out.println("Valor Total Transportado: " + (preco + imposto));
                break;
            case 2:
                System.out.println("Estado com 25% de Imposto");
                imposto = preco * 0.25;
                System.out.println("Valor Imposto: " + (imposto));
                System.out.println("Valor Total Transportado: " + (preco + imposto));
                break;
            case 3:
                System.out.println("Estado com 15% de Imposto");
                imposto = preco * 0.15;
                System.out.println("Valor Imposto: " + (imposto));
                System.out.println("Valor Total Transportado: " + (preco + imposto));
                break;
            case 4:
                System.out.println("Estado com 5% de Imposto");
                imposto = preco * 0.05;
                System.out.println("Valor Imposto: " + (imposto));
                System.out.println("Valor Total Transportado: " + (preco + imposto));
                break;
            case 5:
                System.out.println("Estado isento de imposto");
                imposto = preco;
                System.out.println("Valor Total Transportado: " + (imposto));
                break;

            default:
                System.out.println("Opção de estado indisponível");
                break;

        }
    }
}
