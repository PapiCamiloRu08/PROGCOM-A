import java.util.ArrayList;
import java.util.List;
public class chichico8 {
    public static void main(String[] args) {
        String[] lirics_jaja = {"a", "b"};
        int[] numeros = {1, 2, 3};
        List<String> combinacioneswao = new ArrayList<>();
        for (String l : lirics_jaja) {
            for (int n : numeros) {
                combinacioneswao.add(l + n);
            }
        }
        System.out.println("Combinasao: " + combinacioneswao);
    }
}
