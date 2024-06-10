public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public static void main(String[] args) throws Exception {
        Iphone iphoneUm = new Iphone();
        System.out.println("Oi, sou um Iphone e faço tudo.");
        iphoneUm.tocar();
        iphoneUm.pausar();
        iphoneUm.selecionarMusica("Loving is easy");
        iphoneUm.ligar("4002-8922");
        iphoneUm.atender();
        iphoneUm.iniciarCorreioVoz();
        iphoneUm.exibirPagina("www.youtube.com.br");
        iphoneUm.adicionarNovaAba();
        iphoneUm.atualizarPagina();

    }

    @Override
    public  void tocar() {
        System.out.println("Tocando música pelo Reprodutor Musical do Iphone...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música pelo Reprodutor Musical do Iphone...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música pelo Reprodutor Musical do Iphone...");
        System.out.println("Você selecionou a seguinte música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando pelo Aparelho Telefonico do Iphone...");
        System.out.println("Esse foi o número discado: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada pelo Aparelho Telefonico do Iphone...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz do Aparelho Telefonico do Iphone...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página do Navegador de Internet do Iphone...");
        System.out.println("Você está acessando o seguinte url: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Navegador de Internet do Iphone...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no Navegador de Internet do Iphone...");
    }
}
