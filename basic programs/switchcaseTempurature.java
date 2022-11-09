import java.util.*;
public class switchcaseTempurature {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in); 
        double temp, res;
        int ch;
        char c;
        do{
        System.out.println("Tempurature Menu\n Press 1 for C into F.\n Press 2 for F into C.");
        ch = input.nextInt();

        System.out.println("Please enter the tempurature below.");
        temp = input.nextDouble();

        switch(ch)
        {   
            case 1: res = ((temp-32)*5)/9;
                    System.out.println("The tempurture is:" + res);
                    break;
            case 2: res = temp * 1.8 + 32;
                    System.out.println("The tempurture is:" + res);
                    break;
            
           default: System.out.println("Please enter a vaild option.");


        }
        System.out.println("Would you like to run again (y/n)");
        c=input.next().charAt(0);
    }while(c=='y' || c=='Y');

    }
}   
