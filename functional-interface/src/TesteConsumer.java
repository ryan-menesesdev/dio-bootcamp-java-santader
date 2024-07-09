
import java.util.Arrays;
import java.util.List;

public class TesteConsumer {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);

        numeros.stream().filter(numero -> numero % 2 == 0).forEach(System.out::println);

    }
}
