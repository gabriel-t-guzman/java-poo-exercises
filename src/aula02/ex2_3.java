package aula02;
import java.util.Scanner;


public class ex2_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreve o cateto oposto:");
        float cateto_oposto = sc.nextFloat();
        System.out.println("Escreve o cateto adjacente:"); 
        float cateto_adjacente = sc.nextFloat();
        
        double hipotenusa = Math.hypot(cateto_oposto,cateto_adjacente);

        double angulo = Math.atan(cateto_oposto/cateto_adjacente);

        System.out.println("A hipotenusa:" + hipotenusa);
        System.out.println("O angulo:" + angulo);
        sc.close();







    
    
    }

} 
