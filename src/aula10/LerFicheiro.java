package aula10;


import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.*;

public class LerFicheiro {

    public static void main (String[] args) {

   try(Scanner input = new Scanner(new File("/home/getar/Documents/POO/cogigo_meu/vim_aulas/src/aula10/a.txt"))) {
  
  // armazenar
    HashMap<String, Integer> subApear = new HashMap<String, Integer>();
    HashMap<String, HashMap> Apear = new HashMap<String, HashMap>();
  

    ArrayList<String> auxList = new ArrayList<String>();
    
    // AUX PARA CORTAR A STRING

    String regex = "(\\s+)|(\\p{Punct})"; 

    while (input.hasNextLine()){
        String line = input.nextLine();
        String[] auxArray = line.split(regex);
        for (String str : auxArray){
        // limpar menor do que 3
        if (str.length() > 2) {auxList.add(str);}
        }     
   }
  System.out.println(auxList); 

  } catch (FileNotFoundException e) {
      System.out.println("SEM FICHEIROOOO!!");
  
  }
 // PARA FAZER PRINT --> " STRING(UPchave) + = + STRING(chave) + = + VALOR(INT) " 
 // FAZER COM DOIS WHILE 

 }
} 
