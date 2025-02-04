
import java.util.Scanner;

public class function{
    public static void main(String[] args) {
        try {
            Scanner SC=new Scanner(System.in);
            System.out.print("Enter your no(1,2,3):");
            int z =SC.nextInt();

        } catch (Exception e)  {
            System.out.println(e);
        }
        System.out.println("hello word");
    }
}