
import java.util.Scanner;

public class calculatemarks {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float sum = 0 ;
        
        

        System.out.println("enter your marks of 1 subject");
        int a = num.nextInt();
        System.out.println("enter your marks of 2 subject");
        int b = num.nextInt();
        System.out.println("enter your marks of 3 subject");
        int c = num.nextInt();
        System.out.println("enter your marks of 4 subject");
        int d = num.nextInt();
        System.out.println("enter your marks of 5 subject");
        int e = num.nextInt();
        sum = a+b+c+d+e;
        System.out.println("your total marks");
        System.out.println(sum);
        System.out.println("your percentage");
        System.out.println(sum/5);
    }
}

