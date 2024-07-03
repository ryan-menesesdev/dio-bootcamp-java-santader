public class Evento {
    private String nomeEvento;
    private String nomeAtracao;

    public Evento(String nomeEvento, String nomeAtracao) {
        this.nomeEvento = nomeEvento;
        this.nomeAtracao = nomeAtracao;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }
    public String getNomeAtracao() {
        return nomeAtracao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Evento{");
        sb.append("nomeEvento=").append(nomeEvento);
        sb.append(", nomeAtracao=").append(nomeAtracao);
        sb.append('}');
        return sb.toString();
    }

    

}
