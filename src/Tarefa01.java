import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefa01 {
    public static void main(String[] args) {

        System.out.println("Olá! Vou te apresentar uma lista de itens!");
        System.out.println("Depois vou te perguntar qual você quer remover, okay?");
        System.out.println("-----------------------------------------------------");

        List<String> lista = new ArrayList<>();

        lista.add("Feijão");
        lista.add(  "Arroz");
        lista.add("Macarrão");

        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        Scanner entrada = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println("Dentre esses, qual você deseja remover?");
        String itemRemover = entrada.next();

        lista.remove(itemRemover);

        System.out.println("----------------------------------------");
        System.out.println("LISTA ATUALIZADA:");

        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}
