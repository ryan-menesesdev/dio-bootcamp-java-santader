
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, double anoPublicacao){
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for(Livro l : listaLivros){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for(Livro l : listaLivros){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorAno.add(l);
                }
            }
        }
        return livrosPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!listaLivros.isEmpty()){
            for(Livro l : listaLivros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }


    public static void main(String[] args) throws Exception {
        CatalogoLivros catalogoLivrosOficial = new CatalogoLivros();
        catalogoLivrosOficial.adicionarLivro("Titulo Um", "autor um", 1990);
        catalogoLivrosOficial.adicionarLivro("Titulo Um", "autor um", 1990);
        catalogoLivrosOficial.adicionarLivro("Titulo dois", "autor dois", 1991);
        catalogoLivrosOficial.adicionarLivro("Titulo tres", "autor tres", 1992);
        catalogoLivrosOficial.adicionarLivro("Titulo quatro", "autor quatro", 1993);
        System.out.println(catalogoLivrosOficial.pesquisarPorAutor("autor um"));
        System.out.println(catalogoLivrosOficial.pesquisarPorIntervaloAnos(1990, 1992));
        System.out.println(catalogoLivrosOficial.pesquisarPorTitulo("Titulo Um"));
        
        
        

    }
}
