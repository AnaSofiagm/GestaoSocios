package gestao.socios;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/**
 *
 * @author Pedro Mendes
 */
public class GestaoSocios extends Observable {

    private Map<String, Aluno> alunos;
    
    public GestaoSocios(){
         this.alunos = new HashMap<>();
    }
    public Map<String, Aluno> getAlunos(){
        return alunos;
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
