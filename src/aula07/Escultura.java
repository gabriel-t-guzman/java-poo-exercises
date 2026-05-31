package aula07;

class Escultura extends Obra {

    private String material;
    private int cnt; // count
    
    Escultura (String nome, String autor, double pr, String mate, int quantidade) {
    super(nome, autor, pr);
    material = mate;
    cnt = quantidade;    
    }

    public String getMaterial(){return material;}
    public int getQuantidade(){return cnt;}



}
