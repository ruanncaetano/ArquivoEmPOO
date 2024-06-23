package Arquivo;

public class CEPs {

    private int indicativo;
    private int extensao;
    private String nome;


    // gets e sets

    public int getIndicativo() {
        return indicativo;
    }
    public void setIndicativo(int indicativo) {
        this.indicativo = indicativo;
    }

    public int getExtensao() {
        return extensao;
    }
    public void setExtensao(int extensao) {
        this.extensao = extensao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // construtor
    public CEPs(int indicativo,int extensao,String nome)
    {
        this.indicativo= indicativo;
        this.extensao=extensao;
        this.nome=nome;
    }
    public CEPs(int indicativo,String nome)
    {
        setIndicativo(indicativo);
        setExtensao(0);
        setNome(nome);
    }

    public CEPs()
    {
        setIndicativo(0);
        setExtensao(0);
        setNome("Indisponivel");
    }

    // metodos

    public String mostra()
    {
        return "CEP = "+indicativo+"-"+extensao+", "+nome;
    }
}

