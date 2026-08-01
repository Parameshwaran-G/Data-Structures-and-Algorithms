public class TrappingRainWater {
    public static void main(String[] args){
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int water = 0;
        int n=height.length;
        for(int i=0;i<n;i++){
            int leftMax = 0;
            int rightMax = 0;
            for(int j=0;j<=i;j++){
                leftMax = Math.max(leftMax,height[j]);  
                
            }
            for(int k=i;k<n;k++){
                rightMax = Math.max(rightMax,height[k]);
                
            }
            water += (Math.min(leftMax,rightMax) - height[i]); 
        }
        System.out.println(water);
    }
}
