import java.util.*;
public class revese {
    public static void main(String[]args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("value:");
            int num; 
            num = input.nextInt();

            int i = 0;
            int x;

            while(num != 0) {
                x = num % 10;
                i = i  * 10 + x;

                num /= 10; 

            }
            System.out.println(i);
        }
    }
}
