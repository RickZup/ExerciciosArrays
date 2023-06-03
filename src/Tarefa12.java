import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefa12 {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        int numeroDigitado;

        for (int i = 0; i < 20; i++){
            System.out.println("Insira um número inteiro:");
            numeroDigitado = entrada.nextInt();
            a.add(numeroDigitado);
        }

        int impares = 0;
        int pares = 0;

        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();

        for (int i = 0; i < a.size(); i++){
            if ((a.get(i) % 2) != 0){
                impares = a.get(i);
                c.add(impares);
            } else {
                pares = a.get(i);
                b.add(pares);
            }
        }

        System.out.println("Lista a: " + a);
        System.out.println("Lista b: " + b);
        System.out.println("Lista c: " + c);












    }
}

//        a.add(1);
//        a.add(2);
//        a.add(3);
//        a.add(4);
//        a.add(5);
//        a.add(6);
//        a.add(7);
//        a.add(8);
//        a.add(9);
//        a.add(10);
//        a.add(11);
//        a.add(12);
//        a.add(13);
//        a.add(14);
//        a.add(15);
//        a.add(16);
//        a.add(17);
//        a.add(18);
//        a.add(19);
//        a.add(20);
