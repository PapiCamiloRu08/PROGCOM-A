import java.util.*; // importamos PARA PODE RUTILIZAR EL SCANNER

public class Main {
    public static void main(String[] args) {
        // pedimos al usuario que ingrese un numero con un print
        System.out.println("ingrese un numero: "); 
        Scanner input = new Scanner(System.in); // ingreesmao el nunmeir
        int numero = input.nextInt(); // guardamos el numero ingresado en la variable numero y de paso lo volvemos enetero

        // 1 if / else
        // usamos el operador % para saber si es divisible por 2
        if (numero % 2 == 0) { // respectiva operacion
            System.out.println("con if/else: par"); // si se cumple con la condicion de una se imprime el emesnaje
        } else {
            System.out.println("con if/else: impar"); // y si no se cumple se imprem este mensaje
        }

        // 2 operador ternario
        // simplificamos la condicion en una sola linea
        String resultado = (numero % 2 == 0) ? "par" : "impar"; // su respectiva operacion qu eseria la condicion y si se cumple es par y si no impar
        System.out.println("con ternario: " + resultado);// se imprem su reusltado 

        // 3 switch (con comparacion indirecta)
        // usamos numero % 2 que devuelve 0 si es par y 1 si es impar
        switch (numero % 2) {
            case 0:
                System.out.println("con switch: par"); // el caso 0 es si es par y si se cumple se imprme qu ee spar
                break;
            case 1:
                System.out.println("con switch: impar"); // y si no se imprme esta 
                break;
        }

        input.close(); // cerramos el scanner beshito
    }
}