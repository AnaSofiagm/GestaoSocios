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
         this.alunos.put("1",new Aluno("Pedro","123","MIEI","3","Rua"));
    }
    public Map<String, Aluno> getAlunos(){
        return alunos;
    }
    public void pagarQuota(int numero, String data){

    }
    public Aluno getAluno(int num){
        return alunos.get(num+"");
    }
    public void addAluno(Aluno a){
        alunos.put(a.getNumero(), a);
        this.setChanged();
        this.notifyObservers(alunos);
    }
}
