package aula07;

public class Quadro extends Obra{

    private String ink;
    private String emoldurada;
    private String tela;

    Quadro (String nome, String autor, double pr, String ink, String emoldurada, String tela) {
        super(nome, autor, pr);
        this.ink = ink;
        this.emoldurada = emoldurada;
        this.tela = tela;    
    }

    public String getInk(){return ink;}
    public String getEmol(){return emoldurada;}
    public String getiTela(){return tela;}


}
