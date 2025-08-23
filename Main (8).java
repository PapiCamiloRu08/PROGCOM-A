import java.util.*; // importamos scanner para leer datos

public class Main {
    public static void main(String[] args) {
        // pedimos al usuario que ingrese una contraseña de,marea organixadsa dodnde lo imrprimos
        System.out.println("ingrese una contraseña: ");
        Scanner input = new Scanner(System.in); // se guardsa la conbtraseña
        String password = input.nextLine(); // guardamos la contraseña ingresada volviendola texto

        // validamos las reglas
        boolean largo = password.length() > 8; // regla 1: mas de 8 caracteres
        boolean tieneNumero = password.matches(".*[0-9].*"); // regla 2: al menos un numero
        boolean tieneMayus = password.matches(".*[A-Z].*"); // regla 3: al menos una mayuscula

        // condicion final
        boolean valido = largo && tieneNumero && tieneMayus;

        // 1 if / else
        if (valido) {
            System.out.println("con if/else: contraseña valida"); //sis we sumcple las condiciones se imprme esto
        } else {
            System.out.println("con if/else: contraseña invalida");// sis nos e cumplen las condiciones se imprme eeste
        }

        // 2 operador ternario
        String resultado = valido ? "contraseña valida" : "contraseña invalida";
        System.out.println("con ternario: " + resultado);

        // 3 switch (con comparacion indirecta)
        switch (valido ? 1 : 0) {
            case 1:
                System.out.println("con switch: contraseña valida");
                break;
            case 0:
                System.out.println("con switch: contraseña invalida");
                break;
        }

        input.close(); // cerramos el scanner
    }
}