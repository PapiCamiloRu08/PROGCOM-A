import java.util.ArrayList;
import java.util.List;

public class chii3 {
    public static void main(String[] args) {
        List<Integer> dobles = new ArrayList<>();
        for (int num = 1; num <= 5; num++) {
            dobles.add(num * 2);
        }
        System.out.println("Los numeros dobles del 1 al 5: " + dobles);
    }
}
