import java.util.ArrayList;
import java.util.List;

public class chi1 {
    public static void main(String[] args) {
        List<Integer> cuadrados = new ArrayList<>();
        for (int fg = 1; fg <= 10; fg++) {
            cuadrados.add(fg * fg);
        }
        System.out.println("numeritos del 1 al 10 pero ()^2 : " + cuadrados);
    }
}
