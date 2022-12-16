public class PracticeRecursion {
    static int factorial(int n){
        // Base Case
        if(n==0){
            return 1;
        }
        // Recursive Function/ Condition
        return n* factorial(n-1);
    }
    public static void main(String[] args) {
        int result =factorial(5);
        System.out.println(result);

    }
}
