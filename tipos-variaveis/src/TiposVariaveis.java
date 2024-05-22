
import java.util.Scanner;

public class TiposVariaveis {
    public static void main(String[] args){
        int valueReceived;
        try(Scanner input = new Scanner(System.in)) {
            System.out.println("Type a number between 1 and 10: ");
            valueReceived = input.nextInt();
            if (valueReceived >= 1 && valueReceived <=10){
                System.out.println("OK");
            }
            else{
                System.out.println("Not OK");
            }
        }
    }
}
