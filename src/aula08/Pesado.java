package aula08;


public class Pesado extends Viatura{

    double carga_maxima;
    double peso;
    public  Pesado(String m, String brand, String model, double potent, String n, double pesos, double carga){
    super(m,brand,model,potent,n);
       carga_maxima = carga;
       peso = pesos;
    }

    public double getPeso(){return peso;}
    public double getCargaMaxima(){return carga_maxima;}

    public void setPeso(double p){peso = p;}
    public void setCargaMaxima(double c){carga_maxima = c;}

}
