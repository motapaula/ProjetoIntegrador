package ProjetoIntegrador;
import java.util.Scanner;

public class ConversorMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione a operação:");
        System.out.println("1. Real para Dólar");
        System.out.println("2. Real para Euro");
        System.out.println("3. Dólar para Real");
        System.out.println("4. Euro para Real");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        double valor;
        double resultado;

        switch (opcao) {
            case 1:
                System.out.print("Digite o valor em reais: ");
                valor = scanner.nextDouble();
                resultado = valor / 4.90;
                System.out.println("Valor em dólar: " + resultado);
                break;

            case 2:
                System.out.print("Digite o valor em reais: ");
                valor = scanner.nextDouble();
                resultado = valor / 5.20;
                System.out.println("Valor em euro: " + resultado);
                break;

            case 3:
                System.out.print("Digite o valor em dólar: ");
                valor = scanner.nextDouble();
                resultado = valor * 4.90;
                System.out.println("Valor em reais: " + resultado);
                break;

            case 4:
                System.out.print("Digite o valor em euro: ");
                valor = scanner.nextDouble();
                resultado = valor * 5.20;
                System.out.println("Valor em reais: " + resultado);
                break;

            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
