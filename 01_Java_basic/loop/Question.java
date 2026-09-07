package loop;

import java.util.Scanner;

public class Question {
    public static void main(String[] args){
        // print all even number from 1 to 100

        // for(int i = 2; i <= 100; i+=2){
        //     System.out.print(i+" ");
        // }

        //print all odd number divisible by 3 from 1 to 100
        // for(int i = 3; i <= 100; i++){
        //     if(i%3 == 0 && i%2 != 0) System.out.print(i+" ");
        // }

        Scanner sc = new Scanner(System.in);
        
        // Display this  AP - 2,5,8,11.. upto 'n' terms
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        // for(int i = 2; i <= 3*n-1; i+=3){
        //     System.out.print(i+" ");
        // }

        int a = 2, d = 3;
        for(int i = 1; i <= n; i++){
            System.out.print(a+" ");
            a += d;
        } 
    }
}
