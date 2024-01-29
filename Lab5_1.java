//Write a program to create circle class with area function to ƒnd area of circle.
import java.util.Scanner;
public class Lab5_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Area a = new Area();
        System.out.println("enter a value of r: ");
        int r = sc.nextInt();
        double ans = a.circle(r);
        System.out.println(ans);
    }
}
class Area{
    double circle(int r){
    return Math.PI*r*r;
    }
}


