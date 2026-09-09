package loop.pattern_printing.stage5;

import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
        
    System.out.print("Enter the number of n: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){   //Spaces
                System.out.print("  ");
            }
            for(int j = 1; j <= n; j++){   //Number
                System.out.print("* ");
                
            }
            System.out.println();
        }


    }
}
