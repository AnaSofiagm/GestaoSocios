package gestao.socios;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/**
 *
 * @author Pedro Mendes
 */
public class GestaoSocios extends Observable {
    
    private static final SimpleDateFormat DF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

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
    void pagar(String numero, float valor) {
        LocalDateTime now = LocalDateTime.now();
        Date date = Date.from(now.atZone(ZoneId.systemDefault()).toInstant());
        this.alunos.get(numero).getQuotas().put(DF.format(date),valor);
        this.setChanged();
        this.notifyObservers();
    }

    void updateAluno(String numAluno, Aluno aluno) {
        alunos.remove(numAluno);
        alunos.put(aluno.getNumero(), aluno);
        this.setChanged();
        this.notifyObservers(alunos);
    }
}
