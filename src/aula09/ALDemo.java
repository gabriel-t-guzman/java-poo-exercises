package aula09;
import aula06.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class ALDemo {
    public static void main(String[] args) {

        System.out.println("No inicio");
        ArrayList<Integer> c1 = new ArrayList<>();
        for (int i = 10; i <= 100; i+=10)
            c1.add(i);
        
        System.out.println("Size: " + c1.size());
        
        for (int i = 0; i < c1.size(); i++)
            
            System.out.println("Elemento: " + c1.get(i));
       
        HashSet<Pessoa> c3 = new HashSet<>();
        TreeSet<Pessoa> c4 = new TreeSet<>();

        System.out.println("c3.size()=" + c3.size());


        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio");
        c2.remove(0);
        System.out.println(c2);

 // CONTAINS
        System.out.println(c1.get(3).getClass());
        System.out.println(c2.get(1).getClass());
        System.out.println(c1.contains(40));
        c1.set(3, 110);
        c1.set(9, 40);
       System.out.println(c1.lastIndexOf(40));
        System.out.println(c1.contains(60));
        System.out.println(c2.contains("Vento"));
// b)

        Pessoa joao = new Pessoa("Joao");
        Pessoa m = new Pessoa("Maria");
        Pessoa a = new Pessoa("Ana");
        Pessoa beatriz = new Pessoa("Beatriz");
        Pessoa jose = new Pessoa("Jose");

        c3.add(joao);
        c3.add(m);
        c3.add(a);
        c3.add(beatriz);
        c3.add(jose);
        c3.add(joao);

        Iterator<Pessoa> I = c3.iterator();
        while (I.hasNext()) {
            System.out.println(I.next());
        
        
        }
// c) 
        c4.add(beatriz);
        c4.add(a);
        c4.add(m);
        c4.add(jose);
        c4.add(joao);
   

        Iterator<Pessoa> A = c4.iterator();
        while(A.hasNext()) { System.out.println(A.next());}
// para hacer un TreeSet de una clase, esa clase debe tener override el CompareTo() OJO!!!!!!!!!!!!!!!!

    }
}
