package aula02;
import java.util.Scanner;
//import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ex2_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Write a sentence: ");
        
        String data = sc.nextLine();

        int n = countDigits(data);
        int n2 = countSpaces(data);
        boolean f = onlyLowerCase(data);
        System.out.println("The number of digits is " + n);
        System.out.println("The number of spaces is " + n2);
        System.out.println("The string is lowercase? : " + f);
        System.out.println("The string without excess spaces is: " + noSpaces(data));
        System.out.println("Is the string a palindrome? " + palindrome(data));
        sc.close();
    }
    public static int countDigits(String s) {   
       
      //  System.out.println(s);
        int count_digits = 0;
        for (int i = 0; i < s.length(); i++){
           
            if (Character.isDigit(s.charAt(i))) {    
                count_digits ++; 
            }
      }
        return (count_digits);
    }

    public static int countSpaces(String s ) {
    
        int count_spaces = 0;
        for (int i = 0; i < s.length(); i++){
           
            if ((s.charAt(i)) == ' ') {    
                count_spaces ++; 
            }
        }    
        
        return (count_spaces);
    }

    public static boolean onlyLowerCase (String s) {

        
        if (Pattern.matches(".*\\d.*", s)) 
            return false;
        String ns = s.toLowerCase();
        if (ns == s)
            return true;
        return false;
    }

    public static String noSpaces (String s) {

        String regex = "\\s+";
        s = s.replaceAll(regex, " ");
        return s;  
    
    }
    public static boolean  palindrome (String s ) {

        int lengt_2 = (int)(s.length()/2);
        String reverse = "";
        for (int i = 0; i < lengt_2; i++) {
            reverse = s.charAt(i) + reverse;
        }
        for (int i=0; i < lengt_2; i++) {
            if (reverse.charAt(i) != s.charAt(i + lengt_2 + 1))
                return false;
        }
        return true;    
    
    
    }
        // for second exercise use regex and String method replaceAll()  // for other part the solution is use regex to verify is not have numbers, and then compare to its lowercase version // palindrome so EASY  
}
