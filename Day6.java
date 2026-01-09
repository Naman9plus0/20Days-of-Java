
// // //Ans 25
// // // import java.util.Scanner;

// // // public class Day6 {
// // //     public static void main(String[] args) {
// // //         Scanner sc = new Scanner(System.in);
// // //         System.out.println("Enter the number");
// // //         int num = sc.nextInt();
// // //         int n = 0;
// // //         while (num > 0) {
// // //             num = num / 10;
// // //             n = n + 1;
// // //         }
// // //         System.out.println("Total no in  digit =   " + n);
// // //     }

// // // }

// // //========================================================================================================

// // //Ans 26
// // public class Day6 {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter a number");
// //         int num = sc.nextInt();

// //         int factorial = num;
// //         while (num > 1) {
// //             num = num - 1;
// //             factorial = factorial * num;

// //         }
// //         System.out.println("Factorial of number = " + factorial);
// //     }
// // }

// //====================================================================================================================================

// //Ans 27
// public class Day6 {
//     public static void main(String[] args) {

//         int num = 17;
//         boolean isPrime = true;

//         if (num <= 1) {
//             isPrime = false;
//         } else {
//             for (int i = 2; i < num; i++) {   // loop concept
//                 if (num % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }

//         if (isPrime)
//             System.out.println(num + " is a prime number");
//         else
//             System.out.println(num + " is not a prime number");
//     }
// }

// //======================================================================================================================

// //Ans 28
// public class Day6 {
//     public static void main(String[] args) {

//         int n = 10; // number of terms
//         int a = 0, b = 1;

//         System.out.print("Fibonacci Series: ");

//         for (int i = 1; i <= n; i++) {
//             System.out.print(a + " ");
//             int next = a + b;
//             a = b;
//             b = next;
//         }
//     }
// }

// 

//==========================================================================================

//Ans 29

// public class Day6 {
//     public static void main(String[] args) {

//         int num = 7;   // number whose table you want

//         for (int i = 1; i <= 10; i++) {
//             System.out.println(num + " x " + i + " = " + (num * i));
//         }
//     }
// }

//=========================================================================================================

//Ans 30

public class Day6 {
    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // move to next line
            System.out.println();
        }
    }
}
