import java.util.Scanner;

public class PythagoreanNumber {
    public static void main(String[]args) {
        Scanner Sc = new Scanner(System.in);
        int num , a , b ,c;
        do{
            System.out.println("Enter number");
            num = Sc.nextInt();
            if(num < 100 || num > 999){
                System.out.println("enter vail value");

            }
        }while(num < 100 || num> 999);

        c = num % 10;
        b = (num / 10) % 10;
        a = (num / 100) % 10;

        if((a*a == b*b + c*c)  || (b * b == a * a + c*c) || (c * c == a *a + b*b)){
            System.out.println("True");

        }else{
            System.out.println("False");

        }
        Sc.close();

    }
}
