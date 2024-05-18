package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> ordenandoNumeros;

    public OrdenacaoNumeros() {
        this.ordenandoNumeros = new ArrayList<>();
    }
    
    public void adicionarNumero(int numero){
        ordenandoNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> ascendentes = new ArrayList<>(this.ordenandoNumeros);
        Collections.sort(ascendentes);
        return ascendentes;
    }

    public void exibirNumeros(){
        System.out.println(this.ordenandoNumeros);
    }
    public static void main(String[] args) {
        
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.exibirNumeros();
        ordenacaoNumeros.adicionarNumero(5);
        System.out.println(ordenacaoNumeros.ordenarAscendente());
        ordenacaoNumeros.exibirNumeros();
    }


}
