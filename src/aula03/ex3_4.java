package aula03;
import java.util.Scanner;
import java.util.ArrayList;


public class ex3_4 {

    public static int notaFinal(float notaP, float notaT) {
    
    if ((notaP < 7) || (notaT < 7)) 
        return 66;

    float notaF = (float)(0.4*notaT + 0.6*notaP);
    return (int)notaF;    
    }

    public static void main (String[] args) {

        
        Scanner scam = new Scanner(System.in);
        float notaP; float notaT;
        ArrayList<Float> notasP = new ArrayList<>();
        ArrayList<Float> notasT = new ArrayList<>();
        ArrayList<Integer> notasF = new ArrayList<>();
        
        String s;

       do {

        System.out.println("NotaP :");
         notaP = scam.nextFloat();
        System.out.println("NotaT :");
         notaT = scam.nextFloat();
         if ((notaT <= 20 && notaT >= 0) && (notaP <= 20 && notaP >= 0)) {
             int notaFinal = notaFinal(notaP, notaT);
             notasP.add(notaP);
             notasT.add(notaT);
             notasF.add(notaFinal);
         }
        System.out.println("Continuar?");
        scam.nextLine();
        s = scam.nextLine();

        } while (!(s.equals("")));

       scam.close();

       System.out.println("NotaT NotaP  Pauta");
       for (int i=0; i < notasF.size(); i++) { 

       System.out.println(notasT.get(i) + " " + notasP.get(i) + "  " + notasF.get(i));

       }
  }

}
