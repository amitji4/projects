
import java.util.Scanner;

public class maxno{

    public static void main(String[] args) {
        max();

    }
        static void max(){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        System.out.println("enter 2 number");
        int b = sc.nextInt();
        System.out.println("enter 3 number");
        int c = sc.nextInt();
        
        if(a>b && a>c){
            System.out.println(a+"is max");

        }
        else if(b>a && b>c){
            System.out.println(b+"is max");

        }
        else{
            System.out.println(c+"is max");
        }
            
        }
    }

    
    
    

