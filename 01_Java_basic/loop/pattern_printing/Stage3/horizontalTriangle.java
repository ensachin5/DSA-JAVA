package loop.pattern_printing.Stage3;

import java.util.Scanner;

public class horizontalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of n: ");
        int n = sc.nextInt();

        // Standard way

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n+1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Method 2

        int a = n;  // no of stars to be printed in each line
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= a; j++){
                System.out.print("* ");
            }
            a--;
            System.out.println();
        }


    }
}
