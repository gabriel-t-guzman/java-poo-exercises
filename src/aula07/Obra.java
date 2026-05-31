package aula07;

public class Obra{

    private String nameObra; 
    private String Autor; 
    private double Price;
    private static int idCounter = 33; 
    private int id;

    Obra (String nome, String autor, double pr) {
        nameObra = nome;
        Autor = autor;
        Price = pr;
        this.id = makeId();
    }

    private int makeId() {
        
        id = idCounter++;
        return id;
    }

    public String getNameObra(){return nameObra;}
    public String getAutor(){return Autor;}
    public double getPrize(){return Price;}
    public int getId(){return id;}



}
