import java.util.Scanner;

public class CelularMatematico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CalculadoraInterface calculadoraCelular = new CalculadoraInterface();
        System.out.println("Digite dois valores para a Calculadora dentro do Celular realizar a soma dos valores: ");
        System.out.println("\nO resultado da soma é: " + calculadoraCelular.soma(input.nextDouble(), input.nextDouble()));

        System.out.println("Digite dois valores para a Calculadora dentro do Celular realizar a subtração dos valores: ");
        System.out.println("\nO resultado da subtração é: " + calculadoraCelular.subtracao(input.nextDouble(), input.nextDouble()));

        System.out.println("Digite dois valores para a Calculadora dentro do Celular realizar a multiplicação dos valores: ");
        System.out.println("\nO resultado da multiplicação é: " + calculadoraCelular.multiplicacao(input.nextDouble(), input.nextDouble()));

        System.out.println("Digite dois valores para a Calculadora dentro do Celular realizar a divisão dos valores: ");
        System.out.println("\nO resultado da divisão é: " + calculadoraCelular.divisao(input.nextDouble(), input.nextDouble()));
    }
}
