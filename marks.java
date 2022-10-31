import java.util.*;
public class marks {
    public static void main(String[]args){
        
        double engmark, mathsmark, compmarks, avg, sum;
        
        // english marks here
        Scanner Sc = new Scanner(System.in);
        do{
        System.out.println("Enter english marks:");
        engmark = Sc.nextDouble();
        
        if(engmark<0 || engmark > 100)
           System.out.println("Error, please enter again");
        } while(engmark<0 || engmark>100);
    
        
        // maths marks here
        Scanner Obj = new Scanner(System.in);
        do {
        System.out.println("Enter maths marks:");
        mathsmark = Obj.nextDouble();
        
        if(mathsmark<0 || mathsmark > 100)
           System.out.println("Error, please enter again");
        } while(mathsmark<0 || mathsmark>100);
        

        //computer marks here 
        Scanner MyObj = new Scanner(System.in);
        do{
        System.out.println("Enter computer marks:");
        compmarks = MyObj.nextDouble();
        
        if (compmarks<0 || compmarks > 100)
           System.out.println("Error, please enter again");
        } while(compmarks<0 || compmarks>100);
        

        int i = 1;
        do {
            sum = engmark + mathsmark + compmarks;
            avg = sum / 3;
            System.out.printf("%-20s %6.0f" , "English marks:" , engmark);
            System.out.printf("\n%-20s %6.0f" ,"Maths marks:" ,  mathsmark);
            System.out.printf("\n%-20s %6.0f" ,"Computer marks:" ,  compmarks);
            System.out.printf("\n%-20s %6.0f" ,"Avgrge marks:" ,  avg);
            i = i + 1;

        }
        while (engmark >= 100 && mathsmark >= 100 && compmarks >= 100 && i > 2);

        if (avg < 40)
            System.out.printf("\n%-20s %6s", "Grade is:" , "F");
        else if(avg <= 50)
            System.out.printf("\n%-20s %6s", "Grade is:" , "E");
        else if (avg <= 60)
            System.out.printf("\n%-20s %6s", "Grade is:" , "D");
        else if (avg <=70)
            System.out.printf("\n%-20s %6s", "Grade is:" , "C");
        else if ( avg<= 80)
            System.out.printf("\n%-20s %6s", "Grade is:" , "B");
        else 
            System.out.printf("\n%-20s %6s", "Grade is:" , "A");
    }
}


// Take the marks of 3 subs between 0 - 100
// summ and average
//take the grade out
