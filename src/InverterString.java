import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String str = scanner.nextLine();
        
        String strInvertida = inverterString(str);
        System.out.println("String invertida: " + strInvertida);
    }

    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int esquerda = 0;
        int direita = caracteres.length - 1;

        while (esquerda < direita) {
            char temp = caracteres[esquerda];
            caracteres[esquerda] = caracteres[direita];
            caracteres[direita] = temp;
            esquerda++;
            direita--;
        }

        return new String(caracteres);
    }
}
