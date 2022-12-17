import java.util.Scanner;
public class PracticeRecursion {
  static void countDigit(int n){
        if(n==0)
            return;
        System.out.println(n); // will print n (n-1) ---5 4 3 2 1
          countDigit(n-1);
          //  System.out.println(n);  // will print 1 2 -----n
    }
       public static void main(String[] args) {
       System.out.println("Enter the digit to print in reverse order");
        Scanner scr = new Scanner(System.in);
        int r = scr.nextInt();
        countDigit(r);

    }
}
