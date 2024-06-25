import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> conjuntoDeConvidados;

    public ConjuntoConvidados() {
        this.conjuntoDeConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        conjuntoDeConvidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadosParaRemover = null;
        for(Convidado c : conjuntoDeConvidados){
            if(c.getCodigoConvite() == codigoConvite){
                convidadosParaRemover = c;
                break;
            }
        }
        conjuntoDeConvidados.remove(convidadosParaRemover);
    }

    public int contarConvidados(){
        return conjuntoDeConvidados.size();
    }

    public void exibirConvidados(){
        System.out.println(conjuntoDeConvidados);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoUm = new ConjuntoConvidados();
        conjuntoUm.adicionarConvidado("Ryan", 10);
        conjuntoUm.adicionarConvidado("Ryan", 10);
        conjuntoUm.adicionarConvidado("Ryan", 10);
        conjuntoUm.adicionarConvidado("Ryan", 15);
        conjuntoUm.adicionarConvidado("Ryan", 123);
        System.out.println(" Existem " + conjuntoUm.contarConvidados() + " convidados"); 
        conjuntoUm.exibirConvidados();
        conjuntoUm.removerConvidadoPorCodigoConvite(15);
        System.out.println(" Existem " + conjuntoUm.contarConvidados() + " convidados"); 
        conjuntoUm.exibirConvidados();

    }
    

}
