import java.util.*;

public class Problem9_palindromeNums {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        long reversed = 0;
        int y = x;
        while (y > 0) {
            reversed = reversed * 10 + y % 10;
            y /= 10;
        }
        return reversed == x;
    }

    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem9_palindromeNums solution = new Problem9_palindromeNums();
        int x = sc.nextInt();
        System.out.println(solution.isPalindrome(x));
    }
}