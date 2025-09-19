import java.util.ArrayList;
import java.util.List;
public class chiiii7 {
    public static void main(String[] args) {
        List<String> tuplitas = new ArrayList<>();
        for (int u = 1; u <= 5; u++) {
            tuplitas.add("(" + u + ", " + (u * u) + ")");
        }
        System.out.println("Tuplas (numerito,  y su cuadrado): " + tuplitas);
    }
}
