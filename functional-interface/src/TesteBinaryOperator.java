import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class TesteBinaryOperator{
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);
        BinaryOperator<Integer> numerosParaSomar = (num1, num2) -> num1 + num2;
        int resultado = numeros.stream().reduce(0, numerosParaSomar);
        System.out.println("A soma é: " + resultado);
    }
}