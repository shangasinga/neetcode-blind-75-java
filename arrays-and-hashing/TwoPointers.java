class TwoPointers {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 0) return new int[0];
        int leftPointer = 0;
        int rigthPointer = nums.length - 1;

        while(leftPointer < rigthPointer){
            int sum = nums[leftPointer] + nums[rigthPointer];
            if(sum == target){
                return new int[] {leftPointer, rigthPointer};
            }
            if(sum > target) rigthPointer--;
            if(sum < target) leftPointer++;
        }
        return new int[0];
    }
}