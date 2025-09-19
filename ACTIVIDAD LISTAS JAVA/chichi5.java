import java.util.ArrayList;
import java.util.List;
public class chichi5 {
    public static void main(String[] args) {
        String[] palabritas = {"python", "java", "c++"};
        List<String> may = new ArrayList<>();
        for (String p : palabritas) {
            may.add(p.toUpperCase());
        }
        System.out.println("Palabras en mayúsculas: " + may);
    }
}
