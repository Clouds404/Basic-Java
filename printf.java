import java.util.Scanner;

public class printf {
    public static void main(String[]args) {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Enter the number:");
        double x; 
        x  = Obj.nextDouble();

        double num = x * 100;

        System.out.printf("%-50s %6.0f","The number given into 100 gives:" , num);
        
        // "%-50s %6.0f"

    }    
}
