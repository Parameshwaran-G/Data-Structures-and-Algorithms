
import java.util.HashMap;

class Problem01{
    public static void main(String[] args){
        int arr[] = {1,-1,2};
        int key = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int prefix ;
        int current = 0;
        for(int num : arr){
            current += num;
            prefix = current-key;
            count += map.getOrDefault(prefix, 0);
            map.put(current,map.getOrDefault(current, 0)+1);
        }
        System.out.println(count);
    }
}