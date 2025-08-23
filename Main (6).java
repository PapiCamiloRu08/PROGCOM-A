import java.util.*; // importamos para utilixar el sscanner

public class Main {
    public static void main(String[] args) {
        // imprimimos qu ele pedimos al usi+uario tres numeros en este caso
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el primer numero: "); // ingresamo sle pimre rnumero
        int num1 = input.nextInt(); // guardamos el primer numero y lo volvemos enetero
        System.out.println("ingrese el segundo numero: ");  // aca tmb lo ingresamos
        int num2 = input.nextInt(); // guardamos el segundo numero lo mismo y su repsectivo (int)
        System.out.println("ingrese el tercer numero: "); // se ingresa
        int num3 = input.nextInt(); // guardamos el tercer numero con int

        // 1 if / else
        // comparamos los tres numeros para determinar el mayor
        if (num1 >= num2 && num1 >= num3) { //rewpectiva operacion y condicion
            System.out.println("con if/else: el mayor es " + num1); // se imprime aca si se cumple la condicion
        } else if (num2 >= num1 && num2 >= num3) { // si no seguimos con esta condicion
            System.out.println("con if/else: el mayor es " + num2); // y se imprme si se cumpe esta
        } else {// y si ya ninguna se cumple 
            System.out.println("con if/else: el mayor es " + num3);// se eimprimiria esta
        }

        // 2 operador ternario
        // usamos el operador ?: para determinar el mayor
        int mayorTernario = (num1 >= num2 && num1 >= num3) ? num1
                           : (num2 >= num1 && num2 >= num3) ? num2
                           : num3;
        System.out.println("con ternario: el mayor es " + mayorTernario); // se imprmime su resultado

        // 3 switch ( en este si casi no lo enetendi profe :( )
        // no hay forma directa con switch para comparar tres, pero usamos math.max qu enos permite pode rutilizar mas numerios
        int mayorSwitch = Math.max(num1, Math.max(num2, num3)); // se vuelve entero los valores
        switch (mayorSwitch) {
            case Integer.MAX_VALUE: // nunca ocurrira, pero se usa estructura
                break;
            default:
                System.out.println("con switch: el mayor es " + mayorSwitch); // se imprime su repsectivo reustado
                break;
        }

        input.close(); // cerramos el scanner jiji
    }
}