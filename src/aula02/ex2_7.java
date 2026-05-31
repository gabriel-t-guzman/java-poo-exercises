package aula02;
import java.util.Scanner;


public class ex2_7 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Sentence? : ");
        String word = sc.nextLine();

        // suponhamos string ideais "Universidade de Aveiro" para n importar as funcoes de ex2_6   
        String[] array_string = word.split(" ");
        char character = ' ';
        String acronim = "";

        for (String el : array_string) {
            if (el.length() < 3) continue;
            character = el.charAt(0);
            acronim += String.valueOf(character); 
          
        }
        sc.close();
       System.out.println(acronim); 
    }





}
