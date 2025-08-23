import java.util.*; // hay que importar para que nos acepte el "Scanner"

public class Main {
    public static void main(String[] args) {
        // Se imprime el mensaje donde pide el numero
        System.out.println("Ingrese un numero papi: ");
        
        Scanner input = new Scanner(System.in); // Se ppide ingresa el numero
        byte numerito = input.nextByte();       // Guardamos el nmero ingresado en la variable numerito
        
        // se imprime el nuemro ingresado
        System.out.println(numerito);
        
        //  if / else if / else
        // Evaluamos si el número es positivo, negativo o cero con su respectiva funcion de if
        if (numerito > 0) {
            System.out.println("positivo, shiii"); // si es postivio se imprime "positivo, shiii"
        } else if (numerito < 0) {
            System.out.println("negativo, feoo");  // si es negativo se imprime "negativo, feoo"
        } else {
            System.out.println("cero, neutro mi rey"); // y si es cero, pues aja se imprime que es neutro
        }
        
        //  operador ternario
        // usamos el operador ?: para simplificar la condición en una sola línea
        String resultado = (numerito > 0) ? "positivo, shiii"
                        : (numerito < 0 ? "negativo, feoo" : "cero, neutro mi rey");
        System.out.println("Con el ternario: " + resultado); // Imprime el resultado respeectivo
        
        //  Switch (con Integer.signum)
        // Integer.signum devuelve: 1 si es positivo, -1 si es negativo y 0 si es cero
        switch (Integer.signum(numerito)) {
            case 1:
                System.out.println("Con el switch: positivo, shiii"); // si es postivio se imprime "Con el switch: positivo, shiii"
                break;
            case -1:
                System.out.println("Con el switch: negativo, feoo"); // si es negativo se imprime "Con el switch: negativo, feoo"
                break;
            case 0:
                System.out.println("Con el switch: cero, neutro mi rey"); // y si es cero, pues aja se imprime que es neutro ajjaja
                break;
        }
        
        input.close(); // se cierra el scanner que se refiere a (input)
    }
}