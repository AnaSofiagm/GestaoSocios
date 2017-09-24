package gestao.socios;

import java.util.*;

public class GestaoSocios extends Observable {

    public static Map<String, Aluno> Alunos;
    
    public Map<String, Aluno> getAlunos(){
        return Alunos;
    }
    
    public void pagarQuota(int numero, String data){
       
    }
    
    public Aluno getAluno(int num){
        return Alunos.get(num+"");
    }
    
    public static void addAluno(Aluno a){
        Alunos.put(a.getNumero(), a);
    }
    
    public static void main(String[] args) {

    }
    
}
