package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros(){
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor (String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livrosList.isEmpty()){
            for (Livro l:livrosList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervalosAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for (Livro l: livrosList){
                if (l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo (String titulo){
        Livro livrosPorTitulo = null;

        if(!livrosList.isEmpty()){
            for (Livro l:livrosList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livrosPorTitulo = l;
                    break;
                }
            }
        }
        return livrosPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros listaLivros = new CatalogoLivros();

        listaLivros.adicionarLivro("Alice no pais das maravilhas", "abc", 2005);
        listaLivros.adicionarLivro("Alice no pais das maravilhas", "abc", 2005);
        listaLivros.adicionarLivro("vivian", "kailany", 2007);
        listaLivros.adicionarLivro("queiroz", "marques", 2005);
        System.out.println(listaLivros.pesquisarPorAutor("kailany"));
    }
}
