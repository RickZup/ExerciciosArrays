import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tarefa07 {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos números você quer inserir?");
        int quantidadeNumeros = entrada.nextInt();

        for (int i = 0; i < quantidadeNumeros; i++){
            System.out.println("Insira um número:");
            int numeroDigitado = entrada.nextInt();
            lista.add(numeroDigitado);
        }

        Collections.reverse(lista);
        System.out.println("Os números digitados em ordem inversa ficam da seguinte maneira:");
        System.out.println(lista);

    }

}
