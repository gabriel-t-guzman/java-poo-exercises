package aula07;
import java.util.Scanner;
import java.util.ArrayList;

public class Galeria {

    static ArrayList<Obra> lista = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void printMenu() {

        System.out.print("\nMenu: \n1. Adicionar uma obra \n2. Listar Obras \n3. Vender uma obra \n4. Calcular o lucro total \n5. Sair\nOpcao:");
    }

    public static void Options(int op) {
        
        
        switch (op){

            case 1:

                System.out.print("Adicionar obra do tipo: \n1. Quadro \n2. Escultura \n3. Obra Digital (NFT) \nTipo do produto: ");
                int b = sc.nextInt();
                sc.nextLine();
                        switch (b){
                            case 1:
                                Galeria.Quadro(); break;
                            case 2:
    //                            Galeria.Escultura();
                                break;
                            case 3: 
                               // Galeria.NFT();
                                break;                         
                            default:
                                break;
                        }
                        break;
            case 2:

                System.out.print("Obras disponiveis:\n");
                break;
            case 3:

                System.out.print("Vender uma obra\n");
                break;

            case 4:
               
                System.out.print("Lucro total \n");
                break;   
            default :
                System.out.print("Sair\n");
                break;
     
        }
    }

    static void Quadro(){

        System.out.print("Nome do Quadro: ");   String nome = sc.nextLine();
        System.out.print("Autor do Quadro: ");   String autor = sc.nextLine();
        System.out.print("Preco do Quadro: ");   double prize = sc.nextDouble();
        sc.nextLine();
        System.out.print("Tipo de Tinta: ");   String ink = sc.nextLine();
        System.out.print("Obra emoldurada(s/n): ");   String emol = sc.nextLine();
        System.out.print("Tamanho da tela(S,M,L): ");   String tela = sc.nextLine();
        
        lista.add(new Quadro(nome, autor, prize, ink, emol, tela));

    }
    public static void main(String[] args) {
      

        int a = 1;
        do {
            Galeria.printMenu();
            
            a = sc.nextInt();
            sc.nextLine();
            System.out.print("\n");
            Galeria.Options(a);
        } while(5 > a && a > 0);
        sc.close();
    }
}
