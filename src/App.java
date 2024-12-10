import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Ex01: Faça uma Calculadora com as operações básicas:
//        System.out.println("Digite o primeiro número: ");
//        int n1 = scanner.nextInt();
//        System.out.println("Digite o segundo número: ");
//        int n2 = scanner.nextInt();
//        System.out.println("Digite um operador(+, -, *, /): ");
//        char operador = scanner.next().charAt(0);
//
//
//        double resultado;
//
//        switch (operador) {
//            case '+':
//                resultado = n1 + n2;
//                System.out.println("Resultado: " + resultado);
//                break;
//            case '-':
//                resultado = n1 - n2;
//                System.out.println("Resultado: " + resultado);
//                break;
//            case '*':
//                resultado = n1 * n2;
//                System.out.println("Resultado: " + resultado);
//                break;
//            case '/':
//                if (n2 != 0) {
//                    resultado = n1 / n2;
//                    System.out.println("Resultado: " + resultado);
//                } else {
//                    System.out.println("Erro divisão por zero.");
//                }
//                break;
//            default:
//                System.out.println("Operador Inválido!");
// Ex02: Verifique se uma palavra é palíndromo:
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        palavra = palavra.toLowerCase(); // Para deixar tudo minúsculo.

        boolean ehPalindromo = true;
        int tamanhoPalavra = palavra.length();

        for (int i = 0; i < tamanhoPalavra/2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanhoPalavra - 1)) {
                ehPalindromo = false;
                break;
            }
        }

        if (ehPalindromo) {
            System.out.println(palavra + " é um palíndromo");
        } else {
            System.out.println(palavra + " não é um palíndromo");
        }


    }
}
