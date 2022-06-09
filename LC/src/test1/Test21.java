package test1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author adwstart
 * @create 2022-05-30 11:11
 */
public class Test21
{
    public int findRepeatNumber(int[] nums) {
        Map<Integer,Integer> valToCount=new HashMap<>();
        for(int i=0;i<=nums.length-1;i++)
        {
            valToCount.put(nums[i],valToCount.getOrDefault(nums[i],0)+1);
        }
        for(int key:valToCount.keySet())
        {
            if(valToCount.get(key)>1)
                return key;
        }
        return 0;
    }
}
