
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> conjuntoProdutos;

    public CadastroProdutos(){
        conjuntoProdutos = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        conjuntoProdutos.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(conjuntoProdutos);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(conjuntoProdutos);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1, "Arroz", 4.5, 10);
        cadastroProdutos.adicionarProduto(2, "Feijão", 3.7, 6);
        cadastroProdutos.adicionarProduto(2, "Feijão", 3.7, 6);
        cadastroProdutos.adicionarProduto(3, "Macarrão", 3.1, 7);
        cadastroProdutos.adicionarProduto(4, "Carne A", 12.5, 13);

        System.out.println(cadastroProdutos.conjuntoProdutos);
        System.out.println("\n" + cadastroProdutos.exibirProdutosPorNome());
        System.out.println("\n" + cadastroProdutos.exibirProdutosPorPreco() + "\n");
    }
}
