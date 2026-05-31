package aula08;


public class Taxi extends Automovel_ligeiro{

    int licenca;
   
    public  Taxi(String m, String brand, String model, double potent, String n, int capa, int number_license){
    super(m,brand,model,potent,n,capa);
       licenca = number_license;
    }

    public int getLicenca(){return licenca;}

    public void setLicenca(int l){licenca = l;}

}
