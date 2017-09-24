package gestao.socios;

import java.util.*;

public class GestaoSocios extends Observable {

    public Map<String, Aluno> alunos;
    
    public GestaoSocios(){
         this.alunos = new HashMap<>();
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
    }
}
