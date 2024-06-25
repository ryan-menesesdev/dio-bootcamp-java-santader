import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listaDePessoas;

    public OrdenacaoPessoas(){
        listaDePessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaDePessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordernarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaDePessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaDePessoas);
        Collections.sort(pessoasPorAltura, new ComparatorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) throws Exception {
        OrdenacaoPessoas ordenador = new OrdenacaoPessoas();
        ordenador.adicionarPessoa("RYAN", 19, 1.85);
        ordenador.adicionarPessoa("RYAN1", 20, 1.70);
        ordenador.adicionarPessoa("RYAN2", 17, 1.82);
        ordenador.adicionarPessoa("RYAN3", 15, 1.91);
        System.out.println(ordenador.listaDePessoas + "\n");
        System.out.println(ordenador.ordernarPorIdade() + "\n"); 
        System.out.println(ordenador.ordenarPorAltura());
    }
}
