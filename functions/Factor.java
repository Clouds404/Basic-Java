import java.util.Scanner;

public class Factor {
    public static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number:");

            int n;
            n= sc.nextInt();
            int count = 0;

            for (int i = 1; i <= n; i++)
                if (n %i ==0)
                {
                    System.out.println(i);
                    count = count  + 1;
                
                }

            System.out.println("the number of factor are: " + count);
        
        }
    }
}
