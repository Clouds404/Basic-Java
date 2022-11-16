import java.util.*;
public class Mensuration {
    public static void main(String[]args){
        double res, rad, len;
        int ch, i,a;
        double pi = 3.141; 
        do
        {
        Scanner x = new Scanner(System.in);
        System.out.println("Menu\nPress 1 for square.\nPress 2 for circle");
        ch = x.nextInt();

        switch(ch) 
        {
            case 1:
            do{
                System.out.println("Press 1 for area of square.\nPress 2 for perimeter of square.");
                i = x.nextInt();

                switch(i)
                {
                    case 1:
                        System.out.println("PLease enter length of the side.");
                        len = x.nextDouble();
                        res = len * len;
                        System.out.println("The area of square is: " + res);
                        break;


                    case 2:
                        System.out.println("Please enterthe lenght of the side");
                        len = x.nextDouble();
                        res = len * 4;
                        System.out.println("The perimeter of square is: " + res);
                        break;

                    default:
                        System.out.println("wrong choice");
                        break;
                }
            }while(i>=1 && i<=2);
            
            break;
            
            case 2:
            do{
                System.out.println("Press 1 of area of circle.\nPress 2 for circumfrence of circle.");
                a = x.nextInt();

                switch(a)
                {
                    case 1:
                        System.out.println("Plese enter the radius of the circle.");
                        rad = x.nextDouble();
                        res = rad * rad * pi;
                        System.out.println("The area of the circle with the radius of " + rad + "is: " + res);
                        break;

                    case 2:
                        System.out.println("Please enter the radius of the circle.");
                        rad = x.nextDouble();
                        res = 2 * pi * rad;
                        System.out.println("The circumference  of the circle with the radius of " + rad + "is: " + res);
                        break;

                }
            }while(a>=1 && a<=2);
            
            
            
                default:
                System.out.println("Please enter a vaild option.");


        }
    }while(ch>=1 && ch<=2);



    }
}
