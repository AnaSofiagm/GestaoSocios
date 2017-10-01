package gestao.socios;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/**
 *
 * @author Pedro Mendes
 */
public class GestaoSocios extends Observable {

    public Map<String, Aluno> alunos;
    
    public GestaoSocios(){
         this.alunos = new HashMap<>();
         this.alunos.put("a79003",new Aluno("a79003","Mendes","MIEI","3","Rua"));
    }
    public Map<String, Aluno> getAlunos(){
        return alunos;
    }
    public void pagarQuota(int numero, String data){

    }
    public Aluno getAluno(String num){
        return alunos.get(num);
    }
    public void addAluno(Aluno a){
        alunos.put(a.getNumero(), a);
        this.setChanged();
        this.notifyObservers(alunos);
    }

    void updateAluno(String numAluno, Aluno aluno) {
        alunos.remove(numAluno);
        alunos.put(aluno.getNumero(), aluno);
        this.setChanged();
        this.notifyObservers(alunos);
    }
}
