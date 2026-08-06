class TwoSumII{
    public static void main(String[] args){
        int nums[] = {1,2,3,4,6};
        int left = 0;
        int right = nums.length-1;
        int target = 100;
        while(left<right){
            int sum = nums[left]+nums[right];
            if(sum>target){
                right--;
            }
            else if(sum<target){
                left++;
            }
            else{
                System.out.println(left+" "+right);
                break;
            }
        }
        System.out.println(-1+" "+(-1));
    }
}