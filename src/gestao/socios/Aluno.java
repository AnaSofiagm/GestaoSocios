package gestao.socios;


public class Aluno {
   
    private String numero;
    private String nome;
    private String curso;
    private String ano;
    private String morada;
    private Quotas quotas;
    
    public Aluno(){
        this.numero = "0";
        this.nome = "nome";
        this.curso = "";
        this.ano = "";
        this.morada = "";
        this.quotas = new Quotas();
    }
    
    public Aluno(String nu, String n, String c, String a, String m){
        this.numero = nu;
        this.nome = n;
        this.curso = c;
        this.ano = a;
        this.morada = m;
        this.quotas = new Quotas();
    }
    
    public String getNome(){ return this.nome; }
    public String getNumero(){ return this.numero; }
    public String getCurso(){ return this.curso; }
    public String getAno(){ return this.ano; }
    public String getMorada(){ return this.morada; }
    public Quotas getQuotas(){ return this.quotas; }
}
