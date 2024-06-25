
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> conjuntoContatos;

    public AgendaContatos(){
        this.conjuntoContatos = new HashSet<>();
    }

    public void adicionarContato( String nome, int numeroTelefone){
        conjuntoContatos.add(new Contato(nome, numeroTelefone));
    }

    public String exibirContatos(){
        return conjuntoContatos.toString();
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : conjuntoContatos){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }

        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumeroTelefone){
        Contato contatoAtualizado = null;
        for(Contato c : conjuntoContatos){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(novoNumeroTelefone);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) throws Exception {
        AgendaContatos agendaDeContatos = new AgendaContatos();

        agendaDeContatos.adicionarContato("Ryan", 129131465);
        agendaDeContatos.adicionarContato("Davi", 123456789);
        agendaDeContatos.adicionarContato("Oliveira", 989263547);
        System.out.println(agendaDeContatos.exibirContatos());
        System.out.println(agendaDeContatos.pesquisarPorNome("Davi"));
        System.out.println(agendaDeContatos.atualizarNumeroContato("Ryan", 40028922));
        System.out.println(agendaDeContatos.exibirContatos());
    }
}
