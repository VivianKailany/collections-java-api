package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeroInteiros;

    public SomaNumeros() {
        this.numeroInteiros = new ArrayList<>();
    }
    
    public void adicionarNumero(int numero){
        numeroInteiros.add(numero);
    }

    public int calcularSoma(){
        int calcularSoma = 0;
        for (Integer numero: numeroInteiros){
            calcularSoma += numero;
        }
        return calcularSoma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        for (Integer numero: numeroInteiros){
            if( maiorNumero<=numero){
                maiorNumero=numero;
            }
        }
        return maiorNumero;
    }
    public int encontrarMenorNumero(){
        int menorNumero = 0;
        for (Integer numero: numeroInteiros){
            if( menorNumero>=numero){
                menorNumero=numero;
            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        System.out.println(numeroInteiros);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);
        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
  

    }
}
