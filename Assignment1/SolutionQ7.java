class SolutionQ7 {
    public int searchInsert(int[] nums, int target) {
    int left=0,right=nums.length-1,mid;
    while(left<=right){
        mid=(left+right)/2;
        if(target==nums[mid])
            return mid;        
        else if(target<nums[mid])
            right=mid-1;
        else
            left=mid+1;
        }
        return left;
    }
    
}