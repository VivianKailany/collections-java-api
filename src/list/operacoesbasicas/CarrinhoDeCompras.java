package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class CarrinhoDeCompras {
    private List<Item> listaItens;

    public List<Item> getListaItens() {
        return listaItens;
    }


    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        
        for (Item i: listaItens){
            if (i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
                }
            }
            listaItens.removeAll(itensParaRemover);
        }
        
    

    public double calcularValorTotal(){
        double valorTotal = 0.0;
        for (Item i: listaItens){
            valorTotal += i.getPreco() * i.getQuantidade();
        }
        return valorTotal;
    }
    
    public void exibirItens(){
        if (listaItens.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            System.out.println("Itens no carrinho:");
            for (Item item : listaItens) {
                System.out.println("- " + item.getNome() + " | Preço: R$ " + item.getPreco() + " | Quantidade: " + item.getQuantidade());
            }
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Scanner scannerItens = new Scanner(System.in).useLocale(Locale.US);
        String comando;

        while (true) {
            System.out.println("Esse é o Carrinho de compras");
            System.out.println("Escolha uma opção: [adicionar, remover, listar, total, sair]");
            comando = scannerItens.nextLine().trim().toLowerCase();

            switch (comando) {
                case "adicionar":
                    System.out.println("Digite o nome do item:");
                    String nome = scannerItens.nextLine();

                    double preco = 0.0;
                    boolean precoValido = false;
                    while (!precoValido) {
                        System.out.println("Digite o preço do item:");
                        if (scannerItens.hasNextDouble()) {
                            preco = scannerItens.nextDouble();
                            precoValido = true;
                        } else {
                            System.out.println("Entrada inválida. Por favor, digite um número válido para o preço.");
                        }
                        scannerItens.nextLine();  // Consumir a nova linha
                    }

                    int quantidade = 0;
                    boolean quantidadeValida = false;
                    while (!quantidadeValida) {
                        System.out.println("Digite a quantidade do item:");
                        if (scannerItens.hasNextInt()) {
                            quantidade = scannerItens.nextInt();
                            quantidadeValida = true;
                        } else {
                            System.out.println("Entrada inválida. Por favor, digite um número inteiro válido para a quantidade.");
                        }
                        scannerItens.nextLine();  // Consumir a nova linha
                    }

                    carrinho.adicionarItem(nome, preco, quantidade);
                    System.out.println("Item adicionado: " + nome);
                    break;

                case "remover":
                if (carrinho.getListaItens().isEmpty()) {
                    System.out.println("O carrinho está vazio.");
                } else {
                    System.out.println("Digite o nome do item a ser removido:");
                    String nomeRemover = scannerItens.nextLine();
                    carrinho.removerItem(nomeRemover);
                    System.out.println("Item removido: " + nomeRemover);
                }
                break;

                case "listar":
                    carrinho.exibirItens();
                    break;

                case "total":
                    double total = carrinho.calcularValorTotal();
                    System.out.printf("Valor total do carrinho: R$ %.2f%n", total);
                    break;

                case "sair":
                    System.out.println("Saindo...");
                    scannerItens.close();
                    return;

                default:
                    System.out.println("Comando não reconhecido.");
                    break;
            }
        }
    }
}
