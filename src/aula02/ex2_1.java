package aula02;
import java.util.Scanner;


public class ex2_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Write a number in seconds");

        int seconds = sc.nextInt();
        
        String s1 = String.format("%02d:%02d:%02d", seconds/3600,(seconds%3600)/60, seconds%60);

        System.out.println(s1);
        sc.close();

    
    
    }

}

