package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaTarefas {

    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }
    
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        Scanner scanner = new Scanner(System.in);
        String comandoTarefa;

        while (true) {
            System.out.println("Esse é Lista de Tarefa");
            System.out.println("Escolha uma opção: [adicionar, remover, listar, total, sair]");
            System.out.print("> ");
            comandoTarefa = scanner.nextLine().trim().toLowerCase();

            switch (comandoTarefa) {
                case "adicionar":
                    System.out.println("Digite a descrição da tarefa:");
                    System.out.print("> ");
                    String descricaoAdicionar = scanner.nextLine();
                    listaTarefas.adicionarTarefa(descricaoAdicionar);
                    System.out.println("Tarefa adicionada: " + descricaoAdicionar);
                    break;
                case "remover":
                    System.out.println("Digite a descrição da tarefa a ser removida:");
                    System.out.print("> ");
                    String descricaoRemover = scanner.nextLine();
                    listaTarefas.removerTarefa(descricaoRemover);
                    System.out.println("Tarefa removida: " + descricaoRemover);
                    break;
                case "listar":
                    System.out.println("Tarefas na lista:");
                    listaTarefas.obterDescricoesTarefas();
                    break;
                case "total":
                    System.out.println("Número total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());
                    break;
                case "sair":
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Comando não reconhecido.");
                    break;
            }
        }
    }
        
}

