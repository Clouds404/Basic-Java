import java.util.*;

class Main {
  public static void main(String[] args) {
    try (Scanner num = new Scanner(System.in)) {
      System.out.println("Enter number");
          
        int x;
        x = num.nextInt();
        
        
        if(x % 2 == 0)
            System.out.println("Even");

        else
            System.out.println("Odd");
    }
  }
} 