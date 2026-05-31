package aula03;
import java.util.Scanner;
import java.util.ArrayList;

public class ex3_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        while (true) {
            System.out.println("Write a number : ");
            numero = sc.nextInt();
            if (numero > 0)
                break;
        }
        sc.close();
        System.out.println(numero);
        //double row = Math.sqrt(numero);
        int n = (int)numero;    

        
        System.out.println(n);
        int s = sumOfPrimes(n);
        System.out.println(s);

    }
    public static int sumOfPrimes(int n) {

        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        ArrayList<Integer> aux_list = new ArrayList<Integer>();

        for (int i=2; i <= n; i++) {
            primeNumbers.add(i);        
        }

        System.out.println(primeNumbers);
        int nrow = (int)Math.sqrt(n);


        for (int i=2; i <= nrow; i++) {
            int n_aux = n/2;
            for (int j=2; j<=n_aux;j++)  {
                
                int el = i*j;
                aux_list.add(el);
                
            }
          primeNumbers.removeAll(aux_list);
          aux_list.clear(); 
        
        }

        System.out.println(primeNumbers);
        int sum = 0;
        for (int el : primeNumbers) {
            sum += el;
        }


        return sum;
    
    
    
    }



}
