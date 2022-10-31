import java.util.*;
public class Salary {
     public static void main(String[] args) {
        try (Scanner x = new Scanner(System.in)) {
            System.out.println("Enter basic");
            double basic; 
            basic = x.nextDouble();


            double IncomeTax;
            if (basic <= 2000)
                IncomeTax = basic * 0;
            else
                IncomeTax = basic * 0.1;


            double DA = 0.25 * basic;
            double HRA = 0.15 * basic;
            double allowence = 0.1 * (DA + HRA);
            double total = basic + DA + HRA + allowence;
           
            double NetSalary = total - IncomeTax;

            System.out.println("basic= " + basic);
            System.out.println("DA = " + DA);
            System.out.println("HRA = " + HRA);
            System.out.println("Allowence=" + allowence);
            System.out.println("total= "+ total);
            System.out.println("Income tax = " + IncomeTax);
            System.out.println("Net salary=" + NetSalary);
        }
    }
}
