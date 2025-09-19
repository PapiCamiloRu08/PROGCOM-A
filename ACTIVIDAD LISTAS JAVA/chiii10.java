import java.util.ArrayList;
import java.util.List;
public class chiii10 {
    public static void main(String[] args) {
        int[] temp = {20, 25, 27, 30, 32};
        List<String> cla = new ArrayList<>();
        for (int t : temp) {
            if (t < 22) {
                cla.add(t + " uy que friito");
            } else if (t <= 29) {
                cla.add(t + " uy pero ya ta templado");
            } else {
                cla.add(t + " ja, esto esta es caliente");
            }
        }
        System.out.println("como siente el clima paisano: "+cla);
    }
}
