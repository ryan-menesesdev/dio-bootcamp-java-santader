
import java.util.HashMap;
import java.util.Map;

public class AgendaDeContatos {
    Map<String, Integer> agendaContatosMap;

    public AgendaDeContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;

        if(!agendaContatosMap.isEmpty()){
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) throws Exception {
        AgendaDeContatos agendaUm = new AgendaDeContatos();

        agendaUm.adicionarContato("Ryan", 12345678);
        agendaUm.adicionarContato("Davi", 91011121);
        agendaUm.exibirContatos();
        System.out.println(agendaUm.pesquisarPorNome("Ryan")); 
    }
}
