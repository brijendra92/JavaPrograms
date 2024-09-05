
import java.util.Scanner;

public class SumOfNumber {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of x");
        Double x=sc.nextDouble();
        System.out.println("Enter value of y");
        Double y=sc.nextDouble();
        Double z=x+y;
        System.out.println("SUm of x and y = " + z);
    }
    
}
