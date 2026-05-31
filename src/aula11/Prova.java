package aula11;
import java.time.LocalDate;

public class Prova{

    public static void main(String args[]) {


      LocalDate hoy = LocalDate.now();
      String nombre = "Henrique";
      String cell = "999333121";
      String email = "hrq@gmail.com";
      
      Contact henrique = new Contact(nombre, cell, email, hoy);
 
      LocalDate dia = LocalDate.of(1990, 5, 15);
      String nombre2 = "Felipe";
      String cell2 = "999666777";
      String email2 = "flp@gmail.com";
      
      Contact felipe = new Contact(nombre2, cell2, email2, dia);
      
     
      System.out.println(henrique.getName());   
      System.out.println(felipe.getId());  
      System.out.println(felipe.toString());
    
    
    
    
    }

}
