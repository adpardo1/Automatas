// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el código a analizar: ");
        String codigo = sc.nextLine();

        for (int i = 0; i < codigo.length(); i++) {
            char caracter = codigo.charAt(i);
            switch (caracter) {
                case ' ':
                case '(':
                case ')':
                case '{':
                case '}':
                case '<':
                case '>':
                case '=':
                    System.out.println(caracter + " es un símbolo");
                    break;
                default:
                    if (Character.isLetter(caracter)) {
                        System.out.println(caracter + " es una letra");
                    } else if (Character.isDigit(caracter)) {
                        System.out.println(caracter + " es un número");
                    }
                    break;
            }
        }
    }
}