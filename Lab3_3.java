//Write a program to find maximum no from given 3 no.
import java.util.Scanner;
public class  Lab3_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (a > b) {
                if (a > c) {
                    System.out.println("A is Greater");
                }   else{
                        System.out.println("C is Greater");
                }
        }else if (b > c) {
            System.out.println("B is Greater");
        }else{
            System.out.println("C is Greater");
        }
    }
}
