import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class ThreeSum{
    public static void main(String[] args) {
        int nums[] = {-4, -1,-1,0,1,2};        
        Arrays.sort(nums);
        if(nums.length == 0 || nums.length < 3){
            System.out.print("No Triplet Exist");
            return;
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            int left = i+1;
            int right = nums.length-1;
            if(i>0 && nums[i]==nums[i-1]) continue;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){
                    ArrayList<Integer> current = new ArrayList<>();
                    current.add(nums[i]);
                    current.add(nums[left]);
                    current.add(nums[right]);
                    result.add(current);
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                    while(right>left && nums[right]==nums[right+1]){
                        right--;
                    }
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            } 
        }
        System.out.println(result);
    }
}