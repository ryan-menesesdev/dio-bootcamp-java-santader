public class Livro {
    private String titulo;
    private String autor;
    private double anoPublicacao;

    public Livro(String titulo, String autor, double anoPublicacao){
        this.titulo = titulo;
        this.autor= autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Livro{");
        sb.append("titulo=").append(titulo);
        sb.append(", autor=").append(autor);
        sb.append(", anoPublicacao=").append(anoPublicacao);
        sb.append('}');
        return sb.toString();
    }


}
