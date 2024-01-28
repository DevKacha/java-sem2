//Write a java program to do sum of command line argument passed as two Double numbers
public class Lab4_1 {
    public static void main(String[] args){
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        
        double sum = num1 + num2;
        System.out.println("sum of args:"+sum);
    }
}
