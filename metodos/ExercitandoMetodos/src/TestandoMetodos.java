public class TestandoMetodos {
    public static void main(String[] args) throws Exception {
        SmartTv televisaoUm = new SmartTv();
        System.out.println("A TV está atualmente " + televisaoUm.getOnOff());
        System.out.println("O canal atual é o " + televisaoUm.getCanal());
        System.out.println("O volume da TV é de " + televisaoUm.getVolume());
        System.out.println();

        televisaoUm.setOnOff(false);
        televisaoUm.setCanal(15);
        televisaoUm.setVolume(5);

        System.out.println("A TV está atualmente " + televisaoUm.getOnOff());
        System.out.println("O canal atual é o " + televisaoUm.getCanal());
        System.out.println("O volume da TV é de " + televisaoUm.getVolume());
        System.out.println();

        televisaoUm.aumentarVolume();
        televisaoUm.aumentarVolume();
        televisaoUm.diminuirVolume();

        System.out.println(televisaoUm.getVolume());
        System.out.println();

        televisaoUm.subirCanal();
        televisaoUm.descerCanal();
        televisaoUm.descerCanal();

        System.out.println(televisaoUm.getCanal());
    }
}
