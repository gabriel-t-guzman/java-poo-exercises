package aula06;
import aula05.*;


public class Pessoa{

    private String nome;
    private int cc;
    private DateYMD dataNasc;    

    public Pessoa (String nome, int cc, DateYMD data) {

        if (nameValid(nome) && ccValid(cc)){
            this.nome = nome;
            this.cc = cc;
            dataNasc = data;
        }  
    }

    public Pessoa (String nome, int cc) {
        if (nameValid(nome) && ccValid(cc)){
            this.nome = nome;
            this.cc = cc;       
    }
    } 

    public Pessoa (String nome) {
        if (nameValid(nome)) 
            this.nome = nome;
    
    }


    String getName() {

        return nome;
    }

    @Override 
    public String toString() {
        if (dataNasc == null) {
            return nome;
        
        }
        String s = (nome + ";" + " CC: " + cc + " Data de nascimento : ");
        String s1 = dataNasc.toString();
        s = s+s1;
        return s; 
    
    }
   
    private static boolean nameValid(String str){

        if (str.isEmpty()) 
            return false;
        return true;

    }

    private static boolean ccValid(int n) {

        if (n > 99999) {
            return true;
        }  
        return false;  
    }
    public static void main(String[] args) {

//        DateYMD data = new DateYMD(1994, 12, 21);
//        pessoa p = new pessoa("Fernando", 12993239, data);
//        System.out.println(p.toString());
    
    
    }
}


