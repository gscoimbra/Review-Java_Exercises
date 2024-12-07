import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = scanner.nextInt();
        System.out.println("Digite um operador(+, -, *, /): ");
        char operador = scanner.next().charAt(0);


        double resultado;

        switch (operador) {
            case '+':
                resultado = n1 + n2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = n1 - n2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = n1 * n2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (n2 != 0) {
                    resultado = n1 / n2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro divisão por zero.");
                }
                break;
            default:
                System.out.println("Operador Inválido!");
        }
    }
}
