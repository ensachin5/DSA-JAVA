package loop.pattern_printing.Stage4;

import java.util.Scanner;

public class oddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of n: ");
        int n = sc.nextInt();

        // Method 1: maths
            // for(int i = 1; i <= n; i++){
            //     for(int j = 1; j <= i; j++){
            //         System.out.print(2*j-1+ " ");
            //     }
            //     System.out.println();
            // }

        // Method 2 : a++
            for(int i = 1; i <= n; i++){
                int a = 1;
                for(int j = 1; j <= i; j++){
                    System.out.print(a+ " ");
                    a += 2;
                }
                System.out.println();
            }
    }
    
}
