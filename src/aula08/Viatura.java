package aula08;


public class Viatura {

    private String matricula;
    private String marca;
    private String modelo;
    private double potencia;
    private String n_quadro;

    public Viatura (String m, String brand, String model, double potent, String n) {
        matricula = m;
        marca = brand;
        modelo = model;
        potencia = potent;   
        n_quadro = n;
    
    }

    // SETTERS

    public void setMatricula(String m){matricula = m;}
    public void setMarca(String brand){marca = brand;}
    public void setModelo(String model){modelo = model;}
    public void setPotencia(double p){potencia = p;}
    public void setN_Quadro(String n){n_quadro = n;}

    // GETTERS
    public String getMatricula(){return matricula;}
    public String getMarca(){return marca;}
    public String getModelo(){return modelo;}
    public double getPotencia(){return potencia;}
    public String getN_Quadro(){return n_quadro;}

 
}
