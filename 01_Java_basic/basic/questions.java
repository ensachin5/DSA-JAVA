import java.util.*;

public class questions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();
        
        double areaOfcircle = 3.1415 * r * r;
        System.out.print("The area of circle is :"+areaOfcircle);
    }
}
