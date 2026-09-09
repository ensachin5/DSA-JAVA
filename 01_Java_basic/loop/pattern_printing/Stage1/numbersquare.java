package loop.pattern_printing.Stage1;

import java.util.Scanner;

public class numbersquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of nxn: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }


    }
}