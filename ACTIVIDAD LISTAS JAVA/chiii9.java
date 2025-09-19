import java.util.ArrayList;
import java.util.List;
public class chiii9 {
    public static void main(String[] args) {
        String[] palabrota = {"sol", "estrella", "mar", "planeta"};
        List<String> largota = new ArrayList<>();
        for (String p : palabrota) {
            if (p.length() > 4) {
                largota.add(p);
            }
        }
        System.out.println("Palabras con más de 4 letras: " + largota);
    }
}
