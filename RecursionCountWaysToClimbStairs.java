// Will show TLE because it is not optimised. It can be optimised using DP.

public class CountWaysToClimbStairs {
        static int climbStairs(int n) {
            // Base case
            if(n<0)
                return 0;
            if(n==0)
                return 1;
            int res = climbStairs(n-1)+ climbStairs(n-2);
            return res;

        }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
