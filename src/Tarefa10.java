import java.util.ArrayList;
import java.util.List;

public class Tarefa10 {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        a.add(10);

        double impares = 0;
        double mediaImpares = 0;

        for (int i = 0; i < a.size(); i++){
            if ((a.get(i) % 2) != 0){
                impares = impares + a.get(i);
            }
        }

        mediaImpares = impares / 10;

        System.out.println("A média dos números impares é igual a: " + mediaImpares);


    }
}
