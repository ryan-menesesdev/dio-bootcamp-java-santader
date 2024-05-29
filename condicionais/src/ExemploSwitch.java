
import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Bem vindo à linha de contato da Operadora Bim, com o que posso ajudar?\n");
            System.out.println("[1] Atendimento ao cliente [2] Dúvidas [3] Novo Cadastro\n");
            System.out.println("--------------------------------/--------------------------------/--------------------------------\n");
            int servicoEscolhido = input.nextInt();
            switch (servicoEscolhido) {
                case 1 -> {
                    System.out.println("Conectando ao atendimento...Por favor, aguarde.");
                }
                case 2 -> {
                    System.out.println("A sua dúvida tem relação com o que?");
                    System.out.println("[1] Operadora [2] Celulares [3] Planos [4] Pagamento"); // programa sujeito a mais alterações posteriormente
                }
                case 3 -> {
                    System.out.println("Para que seu cadastro aconteça corretamente, vá até a agência mais próxima!");
                }
                default -> {
                    System.out.println("Opção não existente.");
                }
            }
        }
    }
        

    
}
