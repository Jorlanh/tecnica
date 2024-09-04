import java.util.Scanner;

public class FibonacciCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        boolean pertence = pertenceFibonacci(numero);
        if (pertence) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean pertenceFibonacci(int num) {
        int a = 0, b = 1;
        while (b < num) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return b == num;
    }
}
