package methods;

public class SumOf1dArray {

    public int[] sumOfArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];  //it returns value of which prior it and collect all one by one
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return nums;

    }
}
