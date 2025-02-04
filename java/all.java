
// public class all {
//     public static void main(String[] args) {
//         System.out.println("welcome to calculator");
//         Scanner sr = new Scanner(System.in);
//         System.out.println("enter first number");
//         int a = sr.nextInt();
//         System.out.println("enter operator");
//         char op = sr.next().charAt(0);
//         System.out.println("enter second number");
//         int b = sr.nextInt();
//         if (op == '+') {
//             System.out.println(a + b);
//         } else if (op == '-') {
//             System.out.println(a - b);
//         } else if (op == '*') {
//             System.out.println(a * b);
//         } else if (op == '/') {
//             System.out.println(a / b);
//         }else if (op == '%') {
//             System.out.println(a % b);
//         }
//         else {
//             System.out.println();
//             for (int i = 1; i <= 3; i++) {
//                 System.out.println("WORNG OPERATOR INPUT !!!");
//                 System.out.println("enter number again");
//                 a = sr.nextInt();
//                 System.out.println("enter operator again");
//                 op = sr.next().charAt(0);
//                 System.out.println("enter number again");
//                 b = sr.nextInt();
//                 if (op == '+') {
//                     System.out.println(a + b);
//                 } else if (op == '-') {
//                     System.out.println(a - b);
//                 } else if (op == '*') {
//                     System.out.println(a * b);
//                 } else if (op == '/') {
//                     System.out.println(a / b);
//                 }
//                 else{
//                     System.out.println("ERROR !!!");}
//             }
//         }
//     }
// }

// even odd check

// public class all{
//     public static void main(String[] args) {
//         System.out.println("enter a number");
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
// if (a / 2==0) {
//     System.out.println("odd");
// } else {
//     System.out.println("even");
// }
// }
// }



//prime number check 
// public class all{
//     public static void main(String[] args) {
//         System.out.println("enter a number");
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int c=0;
//         for(int i=1; i<=a; i++){
//            if( a % i==0){
//             c++;
//            }
//         }
//         if(c==2){
//             System.out.println("prime number");
//         }
//         else{
//             System.out.println("not a prime number");
//         }
//       }
// }


public class all {

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        System.out.println("prime numbers are");
        // int a = sc.nextInt();

        // int c = 0;
        
        for (int j = 1; j <=100 ; j++) {
            int c = 0;
            for(int i=1; i<=j; i++){
                if(j%i==0){
                    c++;
                }
            }
            if(c==2){
                System.out.println(j);
                System.out.println("prime number");
            }
            else{
                System.out.println(j);
                System.out.println("not prime number");
            }
        }
        
        
    }
}
