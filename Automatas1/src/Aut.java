public class Aut {
    public static void main(String[] args) {
        String frase = "3.14 * (5 + 2)[2";
        int posicion = -1; // Inicializar la posición en -1

        // Recorrer la frase caracter por caracter
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == ' ') {
                System.out.println("Espacio en blanco");
                continue; // Saltar al siguiente carácter
            }
            posicion++; // Actualizar la posición actual

            switch (c) {
                // Símbolos
                case '{':
                case '}':
                case '(':
                case ')':
                case '>':
                case '<':
                case '=':
                case '+':
                case '-':
                case '/':
                case '*':
                    System.out.println("Símbolo: " + c);
                    break;

                default:
                    if (Character.isLetter(c)) {
                        System.out.println("Letra: " + c);
                    } else if (Character.isDigit(c)) {
                        System.out.println("Número: " + c);
                    } else if (c == '.') {
                        System.out.println("Punto decimal: " + c);
                    } else {
                        System.out.println("Caracter desconocido en la posición " + posicion + ": " + c);
                    }
                    break;
            }
        }
    }
}
