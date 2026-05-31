package aula08;


public class Motociclo extends Viatura{

    String tipo; // OU "DESPORTIVO" OU "ESTRADA"
    public  Motociclo(String m, String brand, String model, double potent,String n, String type){
    super(m,brand,model,potent,n);
       tipo = type;
    }

    // get
    public String getType(){return tipo;}
    // set
    public void seType(String t){tipo = t;}
}
