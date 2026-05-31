package aula08;


public class Automovel_ligeiro extends Viatura{

    int capacidade;
   
    public  Automovel_ligeiro(String m, String brand, String model, double potent, String n, int capa){
    super(m,brand,model,potent,n);
       capacidade = capa;
    }

    public int getCapacidade(){return capacidade;}

    public void setCapacidade(int c){capacidade = c;}

}
