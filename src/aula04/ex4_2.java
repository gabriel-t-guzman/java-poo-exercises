package aula04;
import java.util.ArrayList;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int  getQuantity() {
        return quantity;
    }
}


class CashRegister {

    
    static float s=0;
    static ArrayList<Product> array = new ArrayList<Product>();


    void addProduct(Product pt) {
        s += pt.getTotalValue();//valor total da compra
        array.add(pt);
    } // esta certo

    @Override
    public String toString() {
        String saida = "Product          Price  Quantity    Total"+"\n\n";

        for (Product el : array) {
        saida += (el.getName() + el.getPrice() + el.getQuantity() + el.getTotalValue() + "\n");  
       }
       saida += "\n"+"Total Value : " + s;
       return saida;
    }
    
// print de un ciclo or ciclar un print? -> melhor ainda UM CICLO COM UMA VARIAVEL
//objeto -> "book" "9.99" "3"
// modificar el toString para que ao ler o array cada elemento seja lido pedindo os respetivos gets  
}

public class ex4_2 {

    public static void main(String[] args) {

        // Cria e adiciona 5 produtos
        CashRegister cr = new CashRegister();
        cr.addProduct(new Product("Book", 9.99, 3));
        cr.addProduct(new Product("Pen", 1.99, 10));
        cr.addProduct(new Product("Headphones", 29.99, 2));
        cr.addProduct(new Product("Notebook", 19.99, 5));
        cr.addProduct(new Product("Phone case", 5.99, 1));
        
        // : Listar o conteúdo e valor total
        System.out.println(cr);

    }
}
