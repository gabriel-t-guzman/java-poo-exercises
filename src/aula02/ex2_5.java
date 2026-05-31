package aula02;


public class ex2_5 {

    public static void main(String[] args) {

        String string1 = "buenosdias";
        String string2 = "BUENOSDIAS";

        //String string3 = string1.toLowerCase();
        System.out.println(string2);

        char save = string1.charAt((string1.length()-1));
        int valor = string2.compareTo(string1);
        String  primeros = string1.substring(0,3);
        
        System.out.println(save);
        System.out.println(valor);
        System.out.println(primeros);

    
    
    }




}
