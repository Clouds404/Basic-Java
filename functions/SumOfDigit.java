import java.util.*;
public class SumOfDigit {
    public static void main (String[]args){
    try (Scanner Aaaaaah = new Scanner(System.in)) {
        System.out.println("Please enter a number");
        int num;
        num = Aaaaaah.nextInt();

        int a;
        int sum = 0;
        int conter = 0;
        
        while( num > 0) { 
            a = num % 10;
            num = num / 10;
            sum = sum + a;

            conter = conter + 1; 

        }
        System.out.println(sum);
    }
}

}