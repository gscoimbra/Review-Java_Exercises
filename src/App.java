import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
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
//
// Ex02: Verifique se uma palavra é palíndromo:
//        System.out.println("Digite uma palavra: ");
//        String palavra = scanner.nextLine();
//
//        palavra = palavra.toLowerCase(); // Para deixar tudo minúsculo.
//
//        boolean ehPalindromo = true;
//        int tamanhoPalavra = palavra.length();
//
//        for (int i = 0; i < tamanhoPalavra/2; i++) {
//            if (palavra.charAt(i) != palavra.charAt(tamanhoPalavra - 1 - i)) {
//                ehPalindromo = false;
//                break;
//            }
//        }
//
//        if (ehPalindromo) {
//            System.out.println(palavra + " é um palíndromo");
//        } else {
//            System.out.println(palavra + " não é um palíndromo");
//        }
// Ex03: Implemente um programa que calcule e exiba os primeiros n números da sequência de Fibonacci. n deve ser fornecido pelo/a usuário/a.
//        System.out.println("Digite o número de termos da sequencia de Fibonacci: ");
//        int n = scanner.nextInt();
//
//        if (n <= 0) {
//            System.out.println("Insira um número maior que 0.");
//        } else {
//            System.out.println("Os primeiros " + n + " números da sequência de Fibonnaci são: ");
//            calcularFibonacci(n);
//        }
//
//    }
//    public static void calcularFibonacci(int n){
//        int primeiro = 0, segundo = 1;
//        for (int i = 1; i <= n; i++) {
//            System.out.println(primeiro + " ");
//            int proximo = primeiro + segundo;
//            primeiro = segundo;
//            segundo = proximo;
//        }
//    }
// Ex04: Crie um programa que leia um número inteiro e exiba o número invertido. Exemplo: se o usuário digitar 1234, o programa deve exibir 4321.
//        System.out.println("Digite um número inteiro: ");
//        int numero = scanner.nextInt();
//
//        int numeroInvertido = inverterNumero(numero);
//        System.out.println("O número invertido é: " + numeroInvertido);
//    }
//
//    public static int inverterNumero(int numero) {
//        int invertido = 0;
//        while (numero != 0) {
//            int digito = numero % 10;
//            invertido = invertido * 10 + digito;
//            numero /= 10; // Remove o último dígito do número original
//        }
//        return invertido;
//    }
// Ex05: Escreva um programa que receba duas palavras e determine se elas são anagramas (se possuem as mesmas letras, mas em ordem diferente). Exemplo: "amor" e "roma".
//        System.out.println("Digite a primeira palavra: ");
//        String palavra1 = scanner.nextLine();
//        System.out.println("Digite a segunda palavra: ");
//        String palavra2 = scanner.nextLine();
//
//        if (saoAnagramas(palavra1, palavra2)) {
//            System.out.println("As palavras são anagramas.");
//        } else {
//            System.out.println("As palavras não são anagramas.");
//        }
//    }
//
//    public static boolean saoAnagramas(String palavra1, String palavra2) {
//        palavra1 = palavra1.replaceAll("\\s", "").toLowerCase(); // Remove espaços e transforma em letras minúsculas.
//        palavra2 = palavra2.replaceAll("\\s", "").toLowerCase();
//
//        if (palavra1.length() != palavra2.length()) {
//            return false;
//        }
//
//        // Converte as palavras em arrays de caracteres e ordena
//        char[] letras1 = palavra1.toCharArray();
//        char[] letras2 = palavra2.toCharArray();
//        Arrays.sort(letras1);
//        Arrays.sort(letras2);
//
//        // Compara os arrays ordenados
//        return Arrays.equals(letras1, letras2);
//    }
// Ex06: Crie um jogo em que o programa escolhe um número entre 1 e 50, e o/a usuário/a deve adivinhar. O programa informa apenas se o palpite está certo ou errado. O jogo termina quando o número é adivinhado.
//        Random random = new Random();
//
//        int numeroEscolhido = random.nextInt(50) + 1, palpite;
//        while(true) {
//            System.out.println("Escolha um numero: ");
//            palpite = scanner.nextInt();
//
//            if (palpite == numeroEscolhido) {
//                System.out.println("Parabéns você acertou!");
//                break;
//            } else {
//                System.out.println("Errado, tente novamente.");
//            }
//        }
// Ex07: Escreva um programa que leia uma frase e conte o número de palavras nela. Considere que as palavras estão separadas por espaços em branco.
//        System.out.println("Digite uma frase: ");
//        String frase = scanner.nextLine();
//
//        int numeroPalavras = contarPalavras(frase);
//        System.out.println("A frase contém " + numeroPalavras + " palavras");
//    }
//
//        public static int contarPalavras(String frase) {
//            String[] palavras = frase.trim().split("\\s"); // trim() remove espaços em branco extras no início e no fim da string, " Olá Mundo  " -> "Olá Mundo", split() divide a string em um array de substrings com base em um padrão(regex), o padrão \\s corresponde a um ou mais espaços em branco, isso é últil para lidar com múltiplos espaços entre palavras. "Olá Mundo" -> ["Olá", "Mundo"].
//            return palavras.length;
//        }
    }
}
