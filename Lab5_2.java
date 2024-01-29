// Deƒne Time class with constructor to initialize hour and minute. Also deƒne addition method to add two time objects.
import java.util.*;
public class Lab5_2 {
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    Time t1 = new Time();
    //System.out.println("hours="+t1.h);
    //System.out.println("min="+t1.m);
    Time t2 = new Time(7,41);
    //System.out.println("hours="+t2.h);
    //System.out.println("min="+t2.m);
    int h=t1.h+t2.h;
    int m=t1.m+t2.m;
    if(m>59){
        m=m-60;
        h++;
    }
    System.out.println("hours="+h);
    System.out.println("min="+m);
    }
} 
class Time{
    int h,m;
    Time(){
        h=5;
        m=20;
    }
    Time(int hrs,int min){
        h=hrs;
        m=min;
    }
}
