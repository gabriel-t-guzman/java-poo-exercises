package aula02;
import java.util.Scanner;

public class ex2_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Write de variable x1");
        int x1 = sc.nextInt();
        System.out.println("Write de variable y1");
        int y1 = sc.nextInt();
        System.out.println("Write de variable x2");
        int x2 = sc.nextInt();
        System.out.println("Write de variable y2");
        int y2 = sc.nextInt();
        sc.close();

        long ys = y2 - y1; 
        long xs = x2 - x1;

        double distance = Math.hypot(xs, ys);

        System.out.println("The distance is: " + distance);

    }

}
