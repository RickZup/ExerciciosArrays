import java.util.*;

public class Tarefa03 {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Vamos lá! Insira um número:");
        int numero1 = entrada.nextInt();

        System.out.println("Agora insira mais um número, por favor:");
        int numero2 = entrada.nextInt();

        lista.add(numero1);
        lista.add(numero2);
        Collections.sort(lista);
        Collections.reverse(lista);

        System.out.println("----------------------------------------");
        System.out.println("Os números em ordem decrescente ficam desta maneira:");

        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

    }
}
