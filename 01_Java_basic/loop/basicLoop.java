package loop;

import java.util.Scanner;

public class basicLoop {
    public static void main(String[] args){
        // for(int i = 1; i <= 5; i++){
        //     // System.out.println("Sachin");
        //     System.out.print(i+" ");
        //}

        // for(int i = 20; i >= 1; i--){
        //     System.out.print(i+" ");
        // }

        Scanner sc = new Scanner(System.in);

        System.out.print("How much time to print Yashika: ");
        int n = sc.nextInt();

        for(int i = 0; i < n;i++){
            System.out.println("Yashika");
        }

    }
}
