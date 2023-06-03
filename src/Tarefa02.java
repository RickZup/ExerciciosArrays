import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefa02 {
    public static void main(String[] args) {

        System.out.println("Olá! Vou te apresentar uma lista de itens!");
        System.out.println("Depois vou te perguntar o que você quer adicionar, okay?");
        System.out.println("-----------------------------------------------------");

        List<String> lista = new ArrayList<>();

        lista.add("Feijão");
        lista.add("Arroz");
        lista.add("Macarrão");

        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        Scanner entrada = new Scanner(System.in);
        System.out.println("-----------------------------------------------------");
        System.out.println("Qual item você quer adicionar?");
        String itemAdicionado = entrada.next();

        System.out.println("E em qual posição da lista?");
        int posicao = entrada.nextInt();
        posicao--;

        if (posicao > lista.size() || posicao < 0){
            System.out.println("Valor inválido!");
        }

        lista.add(posicao, itemAdicionado);

        System.out.println("-----------------------------------------------------");
        System.out.println("LISTA ATUALIZADA!");

        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}
