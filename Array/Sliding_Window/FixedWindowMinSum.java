package Array.Sliding_Window;

class FixedWindowMinSum{
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5,5};
        int windowSize = 3;
        int sum = 0;
        int minSum = Integer.MAX_VALUE;
        for(int i=0;i<windowSize;i++){
            sum += nums[i];
        }
        minSum = Math.min(minSum,sum);
        for(int i=windowSize;i<nums.length;i++){
            sum += nums[i]-nums[i-windowSize];
            minSum = Math.min(minSum,sum);
        }
        System.out.println(minSum);
    }
}