
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaDeTarefas;
    public ListaTarefas(){
        this.listaDeTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaDeTarefas.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa x : listaDeTarefas){
            if (x.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(x);
            }
        }
        listaDeTarefas.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return listaDeTarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listaDeTarefas.toString());
    }

    public static void main(String[] args) {
        ListaTarefas listaUm = new ListaTarefas();
        listaUm.adicionarTarefa("brabo");
        listaUm.adicionarTarefa("brabinho");
        listaUm.adicionarTarefa("brabao");
        System.out.println(listaUm.obterNumeroTotalTarefas());
        listaUm.obterDescricoesTarefas();
        listaUm.removerTarefa("brabo");
        System.out.println(listaUm.obterNumeroTotalTarefas());
        listaUm.obterDescricoesTarefas();

    }
}
