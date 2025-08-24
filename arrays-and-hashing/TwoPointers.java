class TwoPointers {
    // The below is considering the array is sorted
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

    // The below case take into consideration that array is not sorted
    public int[] twoSumUnsortedArray(int[] nums, int target){
        if(nums.length == 0) return new int[0];
        // In case of non sorted array, and we are required to return initial indexes
        // To achieve that, we will make use of HashMap to traverse the array
        // and check if target - num exists in the HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        for( int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                int index = map.get(complement);
                return new int[] {index, i};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }
}