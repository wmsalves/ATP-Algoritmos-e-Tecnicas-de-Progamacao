import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codgc = 0, codgp = 0;
        double peso, preco = 0, imposto;

        System.out.println("Informe o código do produto (1 a 10): ");
        codgc = sc.nextInt();
        System.out.println("Informe o peso da carga (em quilos): ");
        peso = sc.nextInt();
        System.out.println("Informe o código do pais (1 a 3): ");
        codgp = sc.nextInt();

        System.out.println("Peso em gramas: " + (peso * 1000));

        if ((codgc >= 1) && (codgc <= 4)) {
            preco = peso * 1000000 * 10;
            System.out.println("Preço por grama: " + preco);
        } else if ((codgc >= 5) && (codgc <= 7)) {
            preco = peso * 1000000 * 25;
            System.out.println("Preço por grama: " + preco);
        } else if ((codgc >= 8) && (codgc <= 10)) {
            preco = peso * 1000000 * 35;
            System.out.println("Preço por grama: " + preco);
        }

        switch (codgp) {
            case 1:
                System.out.println("Estado com 0% de Imposto");
                imposto = preco;
                System.out.println("Valor Imposto: " + (imposto));
                System.out.println("Valor Total Transportado: " + (imposto));
                break;
            case 2:
                System.out.println("Estado com 15% de Imposto");
                imposto = preco * 0.15;
                System.out.println("Valor Imposto: " + (imposto));
                System.out.println("Valor Total Transportado: " + (preco + imposto));
                break;
            case 3:
                System.out.println("Estado com 25% de Imposto");
                imposto = preco * 0.25;
                System.out.println("Valor Imposto: " + (imposto));
                System.out.println("Valor Total Transportado: " + (preco + imposto));
                break;

            default:
                System.out.println("Opção de estado indisponível");
                break;

        }
    }
}