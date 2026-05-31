package aula03;
import java.util.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.LinkedList;
/// IMPORTANTE PARA FORMARAR DOUBLES OR FLOATS PARA 2 CASAS DECIMAIS
import java.math.BigDecimal;
import java.math.RoundingMode;
// Se calhar n era necessario pois no print com o format as restantes casilhas foram tiradas


public class ex3_3 {
    public static void main(String[] args) {
        ArrayList<Integer> DIM = new ArrayList<> (Arrays.asList(1000, 5000, 10000, 20000, 40000));

        Collection<Integer> col1 = new ArrayList<>();
        Collection<Integer> col2 = new LinkedList<>();

        double[][] vs = new double[3][5];
        double[][] vs2 = new double[3][5];
        // vs = values_saved
        vs = organize(col1, DIM);
        vs2 = organize(col2, DIM);
        
        System.out.println(Arrays.deepToString(vs)); 
        System.out.println(Arrays.deepToString(vs2)); 
         //PRINTANDO TUDO
        System.out.println("Collection          1000     5000     10000     20000     40000"); 
        System.out.println("ArrayList");
         System.out.printf("add                 %4.2f     %4.2f      %4.2f      %4.2f      %4.2f",vs[0][0], vs[0][1], vs[0][2], vs[0][3], vs[0][4]);System.out.println();
         System.out.printf("search             %5.2f    %5.2f    %6.2f    %6.2f   %7.2f",vs[1][0], vs[1][1], vs[1][2], vs[1][3], vs[1][4]);System.out.println();
         System.out.printf("remove              %4.2f     %4.2f     %4.2f     %5.2f    %5.2f",vs[2][0], vs[2][1], vs[2][2], vs[2][3], vs[2][4]);System.out.println();
        System.out.println("LinkedList");
         System.out.printf("add                 %4.2f     %4.2f      %4.2f      %4.2f      %4.2f",vs2[0][0], vs2[0][1], vs2[0][2], vs2[0][3], vs2[0][4]);System.out.println();
         System.out.printf("search             %5.2f   %6.2f    %6.2f   %7.2f   %7.2f",vs2[1][0], vs2[1][1], vs2[1][2], vs2[1][3], vs2[1][4]);System.out.println();
         System.out.printf("remove              %4.2f     %4.2f      %4.2f      %4.2f      %4.2f",vs2[2][0], vs2[2][1], vs2[2][2], vs2[2][3], vs2[2][4]);System.out.println();
        //algo interesante --> object.getClass().getSImpleName();
       
    }
    public static double[][] organize(Collection<Integer> tipos, ArrayList<Integer> DIM) {
        double[] parte; // coluna depende dos 500 1000 etc 
        double[][] completo = new double[3][5]; // linha contem todos os insert, search, remove.
        int j = 0;
        for (int el : DIM) {
            
            parte = checkPerformance(tipos, el); // esto me deberia asignar a s los 3 valores  insert,stop,remove de 500;1000;5000 etc
            for (int i=0; i< parte.length; i++) { // aqui coloco cada grupo de 3 en mi array de 5.
                completo[i][j] = parte[i];            
           }    
           j++;
        }        
        //cambiar el tipo de Colecction en los parametros para porder usarla con linedlist, arraylist y sets vrgs
        return completo;
   
    
    }

    public static double[] checkPerformance(Collection<Integer> col, int DIM) {
        double start, stop, delta;
        // Add
        double[] values = new double[3];
     

        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<DIM; i++ )
            col.add( i );
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop-start)/1e6; // convert to milliseconds
        
        BigDecimal bd = new BigDecimal(delta).setScale(2, RoundingMode.HALF_UP);
        delta = bd.doubleValue();

        values[0] = (delta);
        // Search
        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<DIM; i++ ) {
            int n = (int) (Math.random()*DIM);
            if (!col.contains(n))
                System.out.println("Not found???"+n);
        }
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
        
        bd = new BigDecimal(delta).setScale(2, RoundingMode.HALF_UP);
        delta = bd.doubleValue();
        values[1] = (delta);
       
       
        // Remove
        start = System.nanoTime(); // clock snapshot before
        Iterator<Integer> iterator = col.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
        
        bd = new BigDecimal(delta).setScale(2, RoundingMode.HALF_UP);
        delta = bd.doubleValue();
              
        values[2] = (delta);
        
        return values;

       
    }
  
}
