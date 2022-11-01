import java.util.*;

class Grade {
  public static void main() {
    try (Scanner num = new Scanner(System.in)) {
      System.out.println("Enter number");

      int mark;
      mark = num.nextInt();

      if (mark > 90)
        System.out.println("A");
      else if (mark >= 80)
        System.out.println("B");
      else if (mark >= 60)
        System.out.println("c");
      else if (mark >= 40)
        System.out.println("D");

      else
        System.out.println("NG");
    }
  }

}