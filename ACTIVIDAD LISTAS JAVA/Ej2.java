import java.util.ArrayList;
import java.util.List;

public class chii2 {
    public static void main(String[] args) {
        List<Integer> pares = new ArrayList<>();
        for (int h = 0; h <= 20; h++) {
            if (h % 2 == 0) {
                pares.add(h);
            }
        }
        System.out.println("los numeritos pares del 0 al 20: " + pares);
    }
}
