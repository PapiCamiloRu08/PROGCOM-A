import java.util.*; // importamso pasrqa dpoder utiliozar el sscanner

public class Main {
    public static void main(String[] args) {
        // imprimimos por etsetica al usario donde le pedimos su califcacion
        System.out.println("ingrese su calificacion (0 - 100): ");
        Scanner input = new Scanner(System.in); // se ingresa la nota 
        int nota = input.nextInt(); // guardamos la calificacion en la variable nota y claraamnete la volvemos entero

        // 1 if / else
        // evaluamos si la nota es mayor o igual a 60 para aprobar, si no reprueba y pailas hermano jajas
        if (nota >= 60) { // se hace la operacion donde se termina  si es mayor o igual a la nota de 60
            System.out.println("con if/else: aprobado relajese papi"); // si se cumple se imprme qu epaso el año
        } else {
            System.out.println("con if/else: reprobado");// si no se cumple pailas Jsjaksj
        }

        // 2 operador ternario
        // usamos el operador(?:)en una sola linea para decidir el mensaje
        String resultado = (nota >= 60) ? "aprobado relajese papi" : "reprobado"; // SE HAce la repsectiva iperacion dodne se dtermina el aporbado y reprobado
        System.out.println("con ternario: " + resultado); // se imprem el resultado 

        // 3 switch (con comparacion indirecta)
        // convertimos la condicion en 1 (aprobado) o 0 (reprobado)
        switch (nota >= 60 ? 1 : 0) {
            case 1:
                System.out.println("con switch: aprobado relajese papi"); // si cumple con el 1 impime el mensaje del 1
                break;
            case 0:
                System.out.println("con switch: reprobado"); // y si soslo cumple la del cero imprime la del 0 skajskaj
                break;
        }

        input.close(); // cerramos el scanner MUAK
    }
}