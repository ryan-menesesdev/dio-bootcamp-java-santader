public abstract class ServicoDeMensagens {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    protected void validarInternet(){
        System.out.println("Validando se está conectado à internet.");
    };
}
