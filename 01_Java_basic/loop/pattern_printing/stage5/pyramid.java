package loop.pattern_printing.stage5;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        
    System.out.print("Enter the number of n: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

        // Method 1:
            // for(int i = 1; i <= n; i++){  //lines
            //     for(int j = 1; j <= n-i; j++){   //Spaces
            //         System.out.print("  ");
            //     }
            //     for(int j = 1; j <= 2*i-1; j++){   //stars
            //         System.out.print("* ");
                    
            //     }
            //     System.out.println();
            // }

        // Method 2: nsp-nst method.  variable mast way 
        int nsp = n-1, nst = 1;
        for(int i = 1; i <= n; i++){  //lines
            for(int j = 1; j <= nsp; j++){   //Spaces
                System.out.print("  ");
            }
            for(int j = 1; j <= nst; j++){   //stars
                System.out.print("* ");
            }
            nsp--;
            nst += 2;
            System.out.println();
        }


    }
}
