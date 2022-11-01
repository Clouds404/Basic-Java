import java.util.Scanner;

public class temppurture {
    public static void main(String[]args){
        try (Scanner x = new Scanner(System.in)) {
            System.out.println("Enter the tmep in c");
            double cel;
            cel = x.nextDouble();
            
            double far;
            far = cel * 1.8 + 32;
            System.out.println(far);
        }


    }


    public static void main1(String[]args) {
        try (Scanner y = new Scanner(System.in)) {
            System.out.println("Enter the temp in f");
            double far;
            far = y.nextDouble();

            double cel;
            cel = ((far-32)*5)/9;
            System.out.println(cel);
        }
    }
}