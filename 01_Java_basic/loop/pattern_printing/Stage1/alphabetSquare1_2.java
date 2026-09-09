package loop.pattern_printing.Stage1;

import java.util.Scanner;

public class alphabetSquare1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of nxn: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print((char)(j+64)+ " ");
            }
            System.out.println();
        }


    }
}