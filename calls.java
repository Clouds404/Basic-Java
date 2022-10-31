import java.util.*;
public class calls {
    public static void main(String[] args) {

        try (Scanner Obj = new Scanner(System.in)) {
            System.out.println("Enter the numbr of calls");
            double calls;
            calls = Obj.nextDouble();

             Scanner MyObj = new Scanner(System.in);
                System.out.println("Enter name:");
                String name;
                name = MyObj.nextLine();
                


                double charge =0;

                if (calls <= 100)
                    charge=200;
                
                else if (calls > 100 && calls <=300)
                    charge=200+(calls-100)*3.5;

                else if (calls > 300 && calls <= 600)
                   charge=200+200*3.5+(calls-300)*5.5;

                else
                    charge=200+200*3.5+300*5.5+(calls-600*10.5);

   
                System.out.println("Name:" + name );
            }
            System.out.println("Cost of the calls is:" );
            


        }

    
    
}
