import java.util.*;
public class name {
    public static void main(String[] args) {
        
        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Enter name:");
            String  x;
            x = obj.nextLine();

            int i = 1;
            int p = 0;

            while (i <= 10)
                System.out.println(x);
                p = i + p;
                i = i + 1;
        }




    }
}
