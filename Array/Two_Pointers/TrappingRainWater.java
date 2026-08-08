public class TrappingRainWater {
    public static void main(String[] args){
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int water = 0;
        int n=height.length;
        int left = 0;
        int right = n-1;
        int leftMax = height[left];
        int rightMax = height[right];
        while(left<=right){
            if(leftMax<=rightMax){
                leftMax = Math.max(leftMax,height[left]);
                water += leftMax-height[left];
                left++;
            }
            else{
                rightMax = Math.max(rightMax,height[right]);
                water += rightMax-height[right];
                right--;
            }
        }
        System.out.println(water);
    }
}
