import java.util.*;

public class Problem1_2Sums {
    public int[] twoSum(int[] nums, int target) {
        // O(n)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]))
                return new int[] { map.get(target - nums[i]), i };
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException();
    }
    // O(2n)
    // for (int i = 0; i < nums.length; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // if (nums[i] + nums[j] == target) {
    // return new int[] { i, j };
    // }
    // }
    // }
    // throw new IllegalArgumentException();
    // }
    // }

    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem1_2Sums solution = new Problem1_2Sums();
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        try {
            int[] result = solution.twoSum(nums, target);
            System.out.println(result[0] + " " + result[1]);
        } catch (IllegalArgumentException e) {
            System.out.println("error");
        }
    }

}