import java.lang.reflect.Array;
import java.util.Arrays;

public class MinimumDifferenceInStudentScores_1984 {
    public static void main(String[] args) {

    }

    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;
        for(int i = 0,j = k-1;j<n;i++,j++){
            result = Integer.min(result,nums[j]-nums[i]);
        }
        return result;
    }

}
