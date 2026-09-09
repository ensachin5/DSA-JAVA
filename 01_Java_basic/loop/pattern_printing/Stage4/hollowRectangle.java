package loop.pattern_printing.Stage4;

import java.util.Scanner;

public class hollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of row: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of col: ");
        int m = sc.nextInt();

        for(int i = 1;i <= n; i++){  
            for(int j = 1;j <= m; j++){  
                if(i==1 || i==n || j==1 || j==m)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
