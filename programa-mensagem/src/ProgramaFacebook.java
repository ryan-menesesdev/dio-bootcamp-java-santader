public class ProgramaFacebook extends ServicoDeMensagens {
    @Override
    public void enviarMensagem(){
        validarInternet();
        System.out.println("Enviando mensagem pelo Facebook\n");
    }

    @Override
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Facebook");
    }
}
