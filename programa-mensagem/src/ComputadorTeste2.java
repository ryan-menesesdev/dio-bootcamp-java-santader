
import java.util.Scanner;

public class ComputadorTeste2 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            ServicoDeMensagens teste = null;
            System.out.println("Escolha entre um dos seguintes aplicativos:");
            System.out.println("[1] Facebook [2] Instagram [3] Whatsapp\n");
            int opcao = input.nextInt();
            if (opcao == 1){
                teste = new ProgramaFacebook();
            }
            else if(opcao == 2){
                teste = new ProgramaInstagram();
            }
            else if(opcao == 3){
                teste = new ProgramaWhatsapp();
            }

            teste.enviarMensagem();
            teste.receberMensagem();
        }
            
    }
    
    
    
}
