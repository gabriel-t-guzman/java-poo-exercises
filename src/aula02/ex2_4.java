package aula02;
import java.util.Scanner;
import java.util.ArrayList;

public class ex2_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Float> numeros = new ArrayList<Float>(); 

        System.out.println("Escreve um numero:");
        float numero = sc.nextFloat();
        float n1 = numero;

        do {
            System.out.println("Escreve um numero:");
            numeros.add(n1);
            n1 = sc.nextFloat();
             

        } while (n1 != numero);

        sc.close();
        System.out.println(numeros);   

        
        float media;
        float sum = 0;
        for(double elemento: numeros){
            sum += elemento;
        }
        media = sum/numeros.size();
              
        System.out.println("A media e' : " + media);
        System.out.println("Elementos acima da media : ");

        for (double elemento: numeros){
            if (elemento > media)        
                System.out.println(elemento);
        
        }




    }




}
