package loop.pattern_printing.Stage1;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of row: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of col: ");
        int col = sc.nextInt();

        for(int i = 1;i <= row; i++){  // kitni lines hogi
            for(int j = 1;j <= col; j++){  // har line me kitna print hoga
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
