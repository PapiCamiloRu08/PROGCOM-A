import java.util.*; // Importamos para poder utilixar el scanner

public class Main {
    public static void main(String[] args) {
        // iprimimos qu eque pedimos al usario los numeros, por etstetica y orden
        System.out.println("Ingrese el primer número: ");
        Scanner input = new Scanner(System.in); //se escannea el numero imprimicdo
        int num1 = input.nextInt(); // Guardamos el primer número y claramente lo volvemos entero

        System.out.println("Ingrese el segundo número: "); //imprimimos que imprime el segundo numero por la misma cuestion de orden
        int num2 = input.nextInt(); // Guardamos el segundo nmro y hacemos lo mismo vovliendlo entero

        // 1 If / else
        // Comparamos num1 y num2 usando if con sus operaciones de <>=
        if (num1 > num2) {
            System.out.println("Con if/else: El mayor es " + num1);// si se cumple con el num1> num2 s eimprime el num1
        } else if (num2 > num1) {
            System.out.println("Con if/else: El mayor es " + num2); // si no se cumple el if se impirmiria num 2 pero en caso que seaniguales nos vamos para abajo con el else
        } else {
            System.out.println("Con if/else: Los dos son iguales"); // y aca se concluiriria qu eosn iguales
        }

        // 2 Operador ternario
        // uamos(?:)para comparar en una sola liea
        String resultado = (num1 > num2) ? "El mayor es " + num1 // se hace su respectiva iperacion de <>= y se simpirmira el que cumpla la condicion
                          : (num2 > num1 ? "El mayor es " + num2 : "Los dos son iguales"); // lo mismo y el codigo pasaria a esta linea si el primero no se cunpliera
        System.out.println("Con ternario: " + resultado); // su respectivo resultado con su metodo

        // 3 Switch (con comparacio indirecta)
        // rstamos num1 - num2 y usamos signum para saber quién es mayor
        switch (Integer.signum(num1 - num2)) {
            case 1:
                System.out.println("Con switch: El mayor es " + num1); // en este caso se imprime si cumple la condicion de quedra postivio despues de la retsa
                break;
            case -1:
                System.out.println("Con switch: El mayor es " + num2); // en este caso es si qwueda negativo
                break;
            case 0:
                System.out.println("Con switch: Los dos son iguales"); // y aca si son iguales
                break;
        }

        input.close(); // Cerramos el scnner
    }
}