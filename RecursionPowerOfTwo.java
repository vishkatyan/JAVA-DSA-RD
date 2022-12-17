import java.util.Scanner;
public class PracticeRecursion {
  static int powerOfTwo(int n){
        if(n==0)
           return 1;
        return 2* powerOfTwo(n-1);
    }
      public static void main(String[] args) {
System.out.println("Enter the power");
        Scanner scr = new Scanner(System.in);
        int result = scr.nextInt();
        System.out.println(powerOfTwo(result));
      }
}
