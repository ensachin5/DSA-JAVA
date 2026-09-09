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
        
    
        // Q5. Display this  AP - 2,5,8,11.. upto 'n' terms

        // System.out.print("Enter the number of terms: ");
        // int n = sc.nextInt();

        //     Method 1: using i
        // // for(int i = 2; i <= 3*n-1; i+=3){
        // //     System.out.print(i+" ");
        // // }

        //     Method 2: using 'a,d' no of terms. 
        //     an = a+(n-1)d    sn = 2a(n-1)d  
        // int a = 2, d = 3;
        // for(int i = 1; i <= n; i++){
        //     System.out.print(a+" ");
        //     a += d;
        // } 


    // Q6. Display this GP - 1,2,4,8,... upto 'n' terms.
    // an = ar^(n-1)

        // Method 2
        // int a = 1, r = 2; 
        // System.out.print("Enter the number of terms: ");
        // int n = sc.nextInt();

        // for(int i = 1; i <= n; i++){
        //     System.out.print(a);
        //     a*=r;
        // }

        // Q7. Print all alphabets with their corresponding ASCII values.
        // A-Z ==> 65-90 && a-z ==> 97-122. asciii values.
        //  for(int i = 65; i<=90; i++){
        //     System.out.println((char)i+ " "+ i);
        //  }


        //break - stop the code where break is declare and execte from the loop

    // Q8. Write a program to print if the number is composite or not 
    // composite no => more than 2 numbers divisible.


        // System.out.print("Enter the number: ");
        // int n = sc.nextInt();

        //     boolean flag = true; // true/0 means prime
        //     for(int i=2;i<=Math.sqrt(n);i++){   // i<=n-1 ==> this condition also right but we can also write i<=Math.sqrt(n) because if a number is composite then it will have a factor less than or equal to its square root.
        //         if(n%i == 0){ // 'i' to 'n' ka ek factor nikla
        //             flag = false; // 1/false means composite            
        //         break;
        //         }
        //     }
        // if(n == 1) System.out.println("Neither Prime nor Composite");
        // else if (flag == false) System.out.println("composite Number");
        // else System.out.println("Prime Number");


    // continue ==> skip the particular iteration

        // for(int i=1;i<=20;i++){
        //     System.out.print(i);
        //     if(i==13) continue;
        //     System.out.println("Good Morning");
        // }


    // Q9. Count the digit of a Number

        // System.out.print("Enter the number: ");
        // int n = sc.nextInt();
        // if(n == 0) n=1;  // n=2,4,7
        // int count = 0;

        // while(n != 0){
        //     n /= 10;
        //     count++;
        // }
        // System.out.println(count);


    // Q10. Print sum of digits of a number 
        
        // System.out.print("Enter the number: ");
        // int n = sc.nextInt();
        // if(n<0) n = -n;
        // int sum = 0;

        // while(n != 0){
        //     int rem = n%10;
        //     sum += rem;  // direct sum += (n%10)
        //     n /= 10;
        // }
        // System.out.println(sum);  // (sum>0) ? sum : -sum
    

    // Q 11. reverse of a number

        // System.out.print("Enter the number: ");
        // int n = sc.nextInt();
        // int r = 0;

        // while(n != 0){
        //     r *= 10;
        //     r += (n%10);
        //     n /= 10;
        // }
        // System.out.println(r);

    // Q12. Facorial of a number

        // System.out.print("Enter the number: ");
        // int n = sc.nextInt();      
        // int fact = 1;

        // for(int i=1;i <= n; i++){
        //     fact *= i;
        //     //System.out.println(fact); HW why?
        // }
        // System.out.println(fact);
        

    // Q13. 'a' raise to the power 'b'

        System.out.print("Enter the number a : ");
        int a = sc.nextInt();
        System.out.print("Enter the number b : ");
        int b = sc.nextInt();
        int pow = 1;

        for(int i=1; i<=b; i++){
            pow *= a;
        }
        System.out.println(a+" raised to the power "+b+" is "+pow);
    }
}
