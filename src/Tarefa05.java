import java.util.*;

public class Tarefa05 {
    public static void main(String[] args) {

        Map<String, Double> empresa = new HashMap<>();

        double soma = 0;
        double mediasalarial = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos funcionários tem na empresa?");
        int numeroDeFuncionarios = entrada.nextInt();

        for (int i = 0; i < numeroDeFuncionarios; i++){
            System.out.println("Digite o nome de um funcionário:");
            String funcionario = entrada.next();
            System.out.println("Agora digite o salário desse funcionário:");
            double salario = entrada.nextDouble();
            empresa.put(funcionario, salario);

            soma += salario;
            mediasalarial = soma / numeroDeFuncionarios;
        }

        System.out.println("---------------------------------------------------------------");
        System.out.println("A grade de funcionários é:");

        for (String chave: empresa.keySet()) {
            System.out.printf("Funcionário: " + chave + " / Salário: %.2f", empresa.get(chave));
            System.out.println();
        }

        System.out.println();
        System.out.println("---------------------------------------------------------------");
        System.out.printf("A média salarial é de: %.2f", mediasalarial);

    }
}
