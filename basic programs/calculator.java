import java.util.*;
public class calculator {
    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)) {
            int A, B, Res, ch;
            System.out.println("\nEnter two integers");
            A = input.nextInt();
            B = input.nextInt();

            System.out.println("\nCalculaator Menu\nPress 1 for addition\nPress 2 for Subtraction\nPress 3 for Multication.");
            ch = input.nextInt();

            switch(ch)
            {
                case 1: Res = A + B;
                        System.out.println("Result = " + Res);
                        break;
                case 2: Res = A - B;
                        System.out.print("Result =" + Res);
                        break;
                case 3: Res = A * B;
                        System.out.println("Result = " + Res);
                        break;
                
                default: System.out.println("Wrong Choice. Please number a vaild choice.");




            }
        }



    }
}
