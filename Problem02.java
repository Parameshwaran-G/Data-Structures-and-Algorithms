class Problem02{
    public static void main(String[] args){

        int[] nums = {1,2,3,4,6};
        int size = 3;

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0;i<size;i++){
            sum += nums[i];
        }

        maxSum = Math.max(sum,maxSum);

        for(int i=size;i<nums.length;i++){
            sum -= nums[i-size];
            sum += nums[i];

            maxSum = Math.max(maxSum,sum);
        }

        System.out.println(maxSum);
    }
}