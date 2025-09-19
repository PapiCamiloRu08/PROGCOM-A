import java.util.ArrayList;
import java.util.List;
public class chichichi6 {
    public static void main(String[] args) {
        List<String> listo = new ArrayList<>();
        for (int p = 1; p <= 10; p++) {
            if (p % 2 == 0) {
                listo.add("par");
            } else {
                listo.add("impar");
            }
        }
        System.out.println("Par o impar del 1 al 10 jijija: " + listo);
    }
}
