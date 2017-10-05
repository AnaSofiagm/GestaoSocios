package gestao.socios;

import java.util.HashMap;
import java.util.Map;


public class Aluno {
   
    private String numero;
    private String nome;
    private String curso;
    private String ano;
    private String morada;
    private Map<String,Float> quotas;
    
    public Aluno(){
        this.numero = "0";
        this.nome = "nome";
        this.curso = "";
        this.ano = "";
        this.morada = "";
        this.quotas = new HashMap<>();
    }
    
    public Aluno(String nu, String n, String c, String a, String m){
        this.numero = nu;
        this.nome = n;
        this.curso = c;
        this.ano = a;
        this.morada = m;
        this.quotas = new HashMap<>();
    }
    
    public String getNome(){ return this.nome; }
    public String getNumero(){ return this.numero; }
    public String getCurso(){ return this.curso; }
    public String getAno(){ return this.ano; }
    public String getMorada(){ return this.morada; }
    public Map<String,Float> getQuotas(){ return this.quotas; }
}
