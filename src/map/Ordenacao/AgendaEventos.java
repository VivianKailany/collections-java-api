package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }
    public void exibirAgenda(){
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){

        LocalDate dataAtutal = LocalDate.now();
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry: eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtutal)|| entry.getKey().isAfter(dataAtutal)){
                System.out.println("o próximo evento:"+ entry.getValue()+ "acontecerá na data: "+ entry.getKey());
            }
        }

        
    }

     public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();

    // Adiciona eventos à agenda
    agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
    agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
    agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
    agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

    // Exibe a agenda completa de eventos
    agendaEventos.exibirAgenda();

    // Obtém e exibe o próximo evento na agenda
    agendaEventos.obterProximoEvento();
  }

    
}
