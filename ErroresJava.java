// Camilo - Ejemplos de errores comunes en Java
public class ErroresJava {

    // 1. KeyError -> En Java es NullPointerException o ausencia de clave en Map
    public static void keyError() {
        java.util.HashMap<String, Integer> mapa = new java.util.HashMap<>();
        mapa.put("AÑO", 20);
        mapa.put("OLO", 70);
        // get() devuelve null si no existe, pero podemos simular error forzando uso de int
        Integer valor = mapa.get("OLA");
        System.out.println(valor + 5); // NullPointerException al intentar usar null
    }

    // 2. IndexError -> ArrayIndexOutOfBoundsException
    public static void indexError() {
        int[] lista = {1, 2, 3, 4};
        System.out.println(lista[6]); // Posición fuera de rango
    }

    // 3. TypeError -> NumberFormatException (intento de conversión inválida)
    public static void typeError() {
        String texto = "abc";
        int numero = Integer.parseInt(texto); // No se puede convertir
        System.out.println(numero);
    }

    // 4. NameError -> En Java es Variable no declarada (Error de compilación)
    // Para mostrar algo en ejecución, simulamos usando una variable nula
    public static void nameError() {
        String v = null;
        System.out.println(v.length()); // NullPointerException
    }

    // 5. IndentationError -> En Java es Error de compilación (no se puede ejecutar)
    // No se puede mostrar en runtime, así que solo mostramos ejemplo correcto
    public static void indentationOK() {
        System.out.println("Indentación en Java se maneja con llaves, no falla en ejecución.");
    }

    // 6. ZeroDivisionError -> ArithmeticException
    public static void zeroDivisionError() {
        int x = 0;
        int b = 8;
        System.out.println(b / x); // División por cero
    }

    // 7. ValueError -> NumberFormatException similar al TypeError
    public static void valueError() {
        String texto = "12a";
        int numero = Integer.parseInt(texto); // Valor inválido
        System.out.println(numero);
    }

    public static void main(String[] args) {
        // Descomenta el que quieras probar (solo uno a la vez para ver el error)

        // keyError();
        // indexError();
        // typeError();
        // nameError();
        // indentationOK(); // No lanza error
        // zeroDivisionError();
        // valueError();
    }
}