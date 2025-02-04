
import java.util.Scanner;

public class functionfloat {

   static  void add(int x,int y){
        System.out.println("int");
        System.out.println(x+y);
    }
    static void add(int x,int y,int z){
        System.out.println("int");
        System.out.println(x+y+z);
    }

    static void add(float x,float y){
        System.err.println("float");
        System.out.println(x+y);
    }
    static void add(double x,double  y){
        System.err.println("double");
        System.out.println(x+y);
    }

    public static void main(String[] args) {

        // add(4.9,6.5);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x value = ");
        float x = sc.nextFloat(); 
        System.out.println("enter y value = ");
        float y = sc.nextFloat();
        System.out.println("your answer =");
        add(x,y);
        
    }
}
