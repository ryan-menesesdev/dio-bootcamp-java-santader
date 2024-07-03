public class Produto {
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Produto{");
        sb.append("nome=").append(nome);
        sb.append(", quantidade=").append(quantidade);
        sb.append(", preco=").append(preco);
        sb.append('}');
        return sb.toString();
    }



}
