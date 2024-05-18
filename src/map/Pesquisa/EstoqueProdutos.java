package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long , Produto> estoqueMap;

    public EstoqueProdutos() {
        this.estoqueMap = new HashMap<>();
    }
    
    public void adicionarProduto(long codigo, String nome, int quantidade, double preco){
        estoqueMap.put(codigo, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if(!estoqueMap.isEmpty()){
            for (Produto p: estoqueMap.values()){
                valorTotalEstoque+=p.getPreco()*p.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    public Produto produtoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto p: estoqueMap.values()){
            if(!estoqueMap.isEmpty()){
                if(p.getPreco()>maiorPreco)
                produtoMaisCaro=p;
            }
        }
        return produtoMaisCaro;
    }

    
    
}
