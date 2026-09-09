package loop.pattern_printing.stage5;

import java.util.Scanner;

public class verticalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of n: ");
        int n = sc.nextInt();

        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n; j++){
        //         if(i+j > n) System.out.print("* ");
        //         else System.out.print("  ");
        //     }
        //     System.out.println();
        // }

        // Method 2: Ek loop ka andar 2 loop
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){   //Spaces
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){   //Stars
                System.out.print("* ");
                
            }
            System.out.println();
        }


    }
}
