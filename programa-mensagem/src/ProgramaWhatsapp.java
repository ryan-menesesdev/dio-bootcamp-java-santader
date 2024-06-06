public class ProgramaWhatsapp extends ServicoDeMensagens {
    @Override
    public void enviarMensagem(){
        validarInternet();
        System.out.println("Enviando mensagem pelo Whatsapp\n");
    }

    @Override
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Whatsapp");
    }
}
