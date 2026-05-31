package aula08;


public class Pessado_pasageiros extends Viatura{

    int passageiros_max;    
    double peso;

    public Pessado_pasageiros(String m, String brand, String model, double potent, String n, double pesos, int pass){
    super(m,brand,model,potent,n);
       passageiros_max = pass;
       peso = pesos;
    }

    public double getPeso(){return peso;}
    public int getPassageirosMax(){return passageiros_max;}


    public void setPeso(double p){peso = p;}
    public void setPassageirosMax(int c){passageiros_max = c;}

}
