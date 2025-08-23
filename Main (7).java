import java.util.*; // importamos para poder utloizar scanner

public class Main {
    public static void main(String[] args) {
        // pedimos al usuario que ingrese un año de manera que lo ipirmimos
        System.out.println("ingrese un año: "); 
        Scanner input = new Scanner(System.in);// se uingres el n8umeor
        int anio = input.nextInt(); // guardamos el año en la variable anio y lo volvemos entero

        // 1 if / else
        // aplicamos la regla de los años bisiestos
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) { // se hace su respevctiva condicion par detemriar si es bsisietp
            System.out.println("con if/else: es bisiesto"); // sis ee cumple la condicion se imprme esto
        } else {
            System.out.println("con if/else: no es bisiesto"); // y sis no se impreme esto
        }

        // 2 operador ternario
        // simplificamos la misma condicion en una sola linea
        String resultado = ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) // se genera su pirncipal operacion y condicion
                            ? "es bisiesto" // si se cuple el ´rimero 
                            : "no es bisiesto"; // si no se cunple el primero y se cumple el segundo
        System.out.println("con ternario: " + resultado); // se imprime el reusltado de l srespectiva operacion

        // 3 switch (con comparacion indirecta)
        // convertimos la condicion a 1 si es bisiesto, 0 si no
        switch (((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) ? 1 : 0) {
            case 1:
                System.out.println("con switch: es bisiesto"); // si cumple a primera condicion asignada como 1 se imprmee esto
                break;
            case 0:
                System.out.println("con switch: no es bisiesto"); // si se cumple la condicion asigada como 0 se oimprimiria etso
                break;
        }

        input.close(); // cerramos el scanner ijij
    }
}