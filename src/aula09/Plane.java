package aula09;




public class Plane{

    String Id;
    String Fabricante; 
    String Modelo;
    int anoProd;
    int maxPas;
    int maxVel;

    Plane(String Id, String fabri, String Model, int anop, int maxP, int maxV) {
        this.Id = Id;
        Fabricante= fabri;
        Modelo = Model;
        anoProd = anop;
        maxPas = maxP;
        maxVel = maxV;
    }
// SETTERS:

    public void setId(String Id){this.Id = Id;}
    public void setFabricante(String Fabricante){this.Fabricante = Fabricante;}
    public void setModelo(String Modelo){this.Modelo = Modelo;}
    public void setAnoProd(int anoProd){this.anoProd = anoProd;}
    public void setMaxPas(int maxPas){this.maxPas = maxPas;}
    public void setMaxVel(int maxVel){this.maxVel = maxVel;}

// GETTERS: 

    public String getId(){return Id;}
    public String getFabricante(){return Fabricante;}
    public String getModelo(){return Modelo;}
    public int getAnoProd(){return anoProd;}
    public int getMaxPas(){return maxPas;}
    public int getMaxVel(){return maxVel;}

    @Override
    public String toString(){
        return ("Id: " + Id + " Fabricante: " + Fabricante + " Modelo: " + Modelo + " Ano de Producao: " + anoProd + " Passageiros maximos: " + maxPas + " Velocidade maxima: " + maxVel);
    
    }



}
