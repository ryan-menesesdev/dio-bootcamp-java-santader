
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Digite dois valores inteiros, o primeiro menor e o segundo maior: ");
            int primeiroValor = input.nextInt();
            int segundoValor = input.nextInt();

            contar(primeiroValor, segundoValor);
        }catch(ParametrosInvalidosException exception){
            System.out.println("Exception. O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    public static void contar(int primeiroValor, int segundoValor) throws ParametrosInvalidosException{
        if (segundoValor > primeiroValor){
            for(int x = primeiroValor; x <= segundoValor; x++){
                System.out.println("Imprimindo o número " + x);
            }
        }
        else{
            throw new ParametrosInvalidosException();
        }
    }
}
