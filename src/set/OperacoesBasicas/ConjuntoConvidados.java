package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set <Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }
    
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoPararemover = null;
        for (Convidado c: convidadosSet){
            if(c.getCodigoConvite()==codigoConvite){
                convidadoPararemover=c;
                break;
            }
        }
        convidadosSet.remove(convidadoPararemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidado(){
        System.out.println(convidadosSet);

    }

    
}
