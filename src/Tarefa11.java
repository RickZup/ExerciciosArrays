import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tarefa11 {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.println("Insira uma idade:");
            int idade = entrada.nextInt();
            a.add(idade);
        }

        Collections.sort(a);

        System.out.println("----------------------------------------------------------------");
        System.out.println("A menor idade é: " + a.get(0) + " e a menor idade é: " + a.get(9));
    }
}
