public class ContainerWithMostWater {
    public static void main(String[] args) {
        int arr[] = {3,1,100,10,6};
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int width = right-left;
            int height = Math.min(arr[left],arr[right]);
            int area = width*height;
            max = Math.max(max,area);
            if(arr[left]<arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println(max);
    }
}
