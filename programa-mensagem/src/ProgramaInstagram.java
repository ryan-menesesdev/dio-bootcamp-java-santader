public class ProgramaInstagram extends ServicoDeMensagens {
    @Override
    public void enviarMensagem(){
        validarInternet();
        System.out.println("Enviando mensagem pelo Instagram\n");
    }

    @Override
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Instagram");
    }
}
