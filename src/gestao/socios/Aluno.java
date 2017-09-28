package gestao.socios;

import java.util.Map;

public class Aluno {
   
    private String nome;
    private String numero;
    private String curso;
    private String ano;
    private String morada;
    private Map<String, Double> datas;
    
    public Aluno(){
        this.nome = "nome";
        this.numero = "0";
        this.curso = "";
        this.ano = "";
        this.morada = "";
        this.datas = null;
    }
    
    public Aluno(String n, String nu, String c, String a, String m){
        this.nome = n;
        this.numero = nu;
        this.curso = c;
        this.ano = a;
        this.morada = m;
        this.datas = null;
    }
    
    public String getNome(){ return this.nome; }
    public String getNumero(){ return this.numero; }
    public String getCurso(){ return this.curso; }
    public String getAno(){ return this.ano; }
    public String getMorada(){ return this.morada; }
    public Map<String, Double> getDatas(){ return this.datas; }
}
