
import java.util.Scanner;

public class NumberTriangle {
    public static void printPattern(int n){
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j+" "); 
            }
            System.out.println("");
            
        }
        
    }
    public static void main(String[] args) {
        //this is use to take user input
        Scanner sc=new Scanner(System.in);
    
        System.out.println("Enter valur of n ");
        int n=sc.nextInt();
        printPattern(n);
    }



    
}
