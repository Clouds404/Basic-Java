import java.util.*;
public class factrical {
    public static void main(String[]args) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.println("Please enter a number");
            double num;
            num = Sc.nextDouble();

            int  i = 1;
            int x = 1;
            for (i=1; i <= num;) {
                x =x * i;
                i = i + 1;


            }
            System.out.println(x);
        }

    }
    
}
