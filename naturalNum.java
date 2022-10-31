import java.util.*;
class naturalNum {
    
    public static void main(String[] args) {

        try (Scanner n = new Scanner(System.in)) {
            System.out.println("Enter a number:");

            int num;
            num = n.nextInt();
            int i=1;
            int p = 0;

            while (i<=num) {
                p = i + p;
                i  = i + 1;
                

            }

            System.out.println(p);
        
        }


   

    }
}
