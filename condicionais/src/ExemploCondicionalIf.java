import java.util.Scanner;

public class ExemploCondicionalIf {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite sua idade: ");
            int idade = input.nextInt();
            
            if (idade < 18){
                System.out.println("Você tem menos de 18! Sai daí");
            }
            
            else if(idade == 18){
                System.out.println("Você tem exatamente 18 anos, massa");
            }
            
            else{
                System.out.println("Entendo, você tem " + idade + " anos, parabéns");
            }
        }
    }
}
