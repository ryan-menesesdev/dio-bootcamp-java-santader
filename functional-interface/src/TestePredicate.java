
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestePredicate {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);
    }
    
}
