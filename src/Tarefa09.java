import java.util.Scanner;

public class Tarefa09 {
    public static void main(String[] args) {

        System.out.println("Olá! Vamos somar 20 números de sua escolha?");
        double[] numeros = new double[20];
        Scanner entrada = new Scanner(System.in);

        double numeroDigitado;
        double soma = 0;

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite um número:");
            numeroDigitado = entrada.nextDouble();
            soma = soma + numeroDigitado;
            numeros[i] = numeroDigitado;
        }

        System.out.println("---------------------------------------");
        System.out.println("Os números digitados foram:");

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        System.out.println("---------------------------------------");
        System.out.println("A soma de todos os 20 números é igual a: " + soma);
    }
}
