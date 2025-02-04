// sum jitne number input le uske bich k ka

import java.util.Scanner;

// public class fam {
//     public static void main(String[] args) {
//         int sum=0;
//         Scanner sc =new Scanner(System.in);
//         System.out.println("enter value a");
//         int a= sc.nextInt();
//         System.out.println("enter value b");
//         int b= sc.nextInt();
//         for (int i = a; i <= b; i++) {
            
//         sum = sum + i;
//        System.out.println(i);
//     }
    
//     System.out.println(sum);
//     }
    
// }



public class fam {
public static void main(String[] args)
 {
            Scanner sc =new Scanner(System.in);
            System.out.println("enter value a");
            int a=sc.nextInt();
            int b=0;
            int c=1;

            for (int i = 1; i <= a; i++)
            {
                int sum = b+c;
                b=c;
                c=sum;
                System.out.println(b);
                
            }
 }
}
