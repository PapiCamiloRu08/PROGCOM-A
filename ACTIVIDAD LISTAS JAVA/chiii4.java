import java.util.ArrayList;
import java.util.List;
public class chiii4 {
    public static void main(String[] args) {
        String palabritagei = "programacion";
        List<Character> vocales = new ArrayList<>();
        for (int v = 0; v < palabritagei.length(); v++) {
            char nr = palabritagei.charAt(v);
            if ("aeiou".indexOf(nr) != -1) {
                vocales.add(nr);
            }
        }
        System.out.println("Vocales de la plaabrita 'programacion': " + vocales);
    }
}
