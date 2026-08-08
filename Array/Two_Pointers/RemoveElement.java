class RemoveElement{
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5};
        int val = 0;
        int slow = 0;
        int n = nums.length;
        for(int fast = slow;fast<n;fast++){
            if(nums[fast]!=val){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        for(int i=0;i<slow;i++){
            System.out.print(nums[i]+" ");
        }
    }
}