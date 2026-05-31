package aula03;
import java.util.Scanner;

public class ex3_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int randomNum = (int)(Math.random() * 100);
        //int counter = 0;


        do {
                       
            System.out.println("Give a shoot : ");
            int trie = sc.nextInt(); 
            
            if (trie < randomNum)
                  System.out.println(trie +  " is lower than (RandomNum)");

            else if (trie > randomNum)
                   System.out.println(trie + " is biggerr than (RandomNum)");          
            if (trie == randomNum) {
                System.out.println("Congratulations!!!!");
                break;            }
            System.out.println("Continue? : (1)");
            int answer2 = sc2.nextInt();  
            if (answer2 != 1){
               break;}  

        
        } while ( true );
        sc.close();
        sc2.close();

         


    
    
    
    
    }



}
