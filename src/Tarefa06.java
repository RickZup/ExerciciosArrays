import java.util.Scanner;

public class Tarefa06 {
    public static void main(String[] args) {
        System.out.println("Digite um número e nós diremos se ele é ou não múltiplo de 5 e 7!");
        System.out.println("-----------------------------------------------------------------");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Vamos lá, digite um número inteiro:");
        int numeroDigitado = entrada.nextInt();

        System.out.println("-----------------------------------------------------------------");

        if (numeroDigitado % 5 == 0 && numeroDigitado % 7 == 0){
            System.out.println(numeroDigitado + " é múltiplo de 5 e de 7!");
        } else if (numeroDigitado % 5 == 0) {
            System.out.println(numeroDigitado + " é múltiplo de 5!");
        } else if (numeroDigitado % 7 == 0) {
            System.out.println(numeroDigitado + " é múltiplo de 7!");
        } else {
            System.out.println("Essenúmero não é múltiplo de 5 nem de 7.");
        }
    }
}
