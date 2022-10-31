import java.util.*;
public class Electrucity {
    public static void main(String[]args){
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.println("Enter the number of units");
            int unit;
            unit = Sc.nextInt();

            double charge=0;

            if (unit <= 100)
                charge = 200;
            
            else if (unit > 100 && unit <=300)
                charge=200+(unit-100)*2.50;

            else if (unit > 300 && unit <=600)
                charge = 200 + 200*2.5+(unit-300)* 4.50;
            else if (unit > 600 && unit <= 1000)
                charge= 200 + 200*2.5 + 300*4.5+(unit-600) * 7.50;
            else 
                charge = 200 + 200*2.5 + 300*4.5+ 400*7.5+ (unit-1000) * 10;


            System.out.println(charge);
        }
    }
}
 