import java.util.*; // importamos scanner para leer datos

public class Main {
    public static void main(String[] args) {
        // pedimos al usuario que ingrese un numero
        System.out.println("ingrese un numero: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt(); // guardamos el numero

        // 1 if / else
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("con if/else: fizzbuzz");
        } else if (num % 3 == 0) {
            System.out.println("con if/else: fizz");
        } else if (num % 5 == 0) {
            System.out.println("con if/else: buzz");
        } else {
            System.out.println("con if/else: " + num);
        }

        // 2 operador ternario
        String resultado = (num % 3 == 0 && num % 5 == 0) ? "fizzbuzz"
                        : (num % 3 == 0) ? "fizz"
                        : (num % 5 == 0) ? "buzz"
                        : String.valueOf(num);
        System.out.println("con ternario: " + resultado);

        // 3 switch (con combinacion de casos)
        switch ((num % 3 == 0 ? 1 : 0) * 2 + (num % 5 == 0 ? 1 : 0)) {
            case 3: // divisible por 3 y 5
                System.out.println("con switch: fizzbuzz");
                break;
            case 2: // divisible solo por 3
                System.out.println("con switch: fizz");
                break;
            case 1: // divisible solo por 5
                System.out.println("con switch: buzz");
                break;
            case 0: // no divisible
                System.out.println("con switch: " + num);
                break;
        }

        input.close(); // cerramos el scanner
    }
}