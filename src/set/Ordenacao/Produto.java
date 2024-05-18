package set.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
    private long codigo;
    private String nome;
    private int quantidade;
    private double preco;
    
    public Produto(long codigo, String nome, int quantidade, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (codigo ^ (codigo >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }

    @Override
    public int compareTo (Produto produtoNome) {
        return nome.compareToIgnoreCase(produtoNome.getNome());
    }

    
}

class CompararProdutosPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto preco1, Produto preco2) {
        return Double.compare(preco1.getPreco(), preco2.getPreco());
    }


}
