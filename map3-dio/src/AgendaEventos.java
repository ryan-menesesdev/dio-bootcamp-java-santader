
import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> agendaEventosMap;

    public AgendaEventos(){
        this.agendaEventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeEvento, String nomeAtracao){
        agendaEventosMap.put(data, new Evento(nomeEvento, nomeAtracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        for(Map.Entry<LocalDate, Evento> entry : agendaEventosMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }

    }

    public static void main(String[] args) throws Exception {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.JULY, 15), "Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MAY, 31), "Evento 2", "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 2), "Evento 3", "Atracao 3");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.APRIL, 3), "Evento 4", "Atracao 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 3), "Evento 5", "Atracao 5");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
