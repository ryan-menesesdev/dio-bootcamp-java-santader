public class ComputadorTeste {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Computador de Testes!");
        System.out.println("Instanciando Facebook...\n");
        ProgramaFacebook fcb = new ProgramaFacebook();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        System.out.println("\nInstanciando Instagram...\n");
        ProgramaInstagram ig = new ProgramaInstagram();
        ig.enviarMensagem();
        ig.receberMensagem();

        System.out.println("\nInstanciando Whatsapp...\n");
        ProgramaWhatsapp wpp = new ProgramaWhatsapp();
        wpp.enviarMensagem();
        wpp.receberMensagem();
    }
}
