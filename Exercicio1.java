import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int valor1 = scanner.nextInt();
        System.out.print("Digite outro número: ");
        int valor2 = scanner.nextInt();
        int soma = valor1 + valor2;
        System.out.println("A soma é: " + soma);
        scanner.close();
    }
}
