package test;

import org.junit.Test;

import java.util.*;

/**
 * @author shkstart
 * @create 2022-03-17 13:33
 */
public class test3
{
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int n=nums.length;
        int i=0;
        for(i=0;i<n-2;i++)
        {
            int j=i+1,k=n-1;
            while(j<k)
            {
                if(nums[j]+nums[k]==-nums[i])
                {
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(nums[j]==nums[j+1]&&j<k)
                        j++;
                    j++;
                }
                else if(nums[j]+nums[k]<-nums[i])
                    j++;
                else
                    k--;
            }
            while(nums[i]==nums[i+1]&&i<n-2)
                i++;
        }
        return result;
    }
    @Test
    public void test()
    {
        int[] arr = {0,0,0};
        List<List<Integer>> lists = threeSum(arr);
        System.out.println(lists);
    }
    @Test
    public void test1()
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        map.put(1,map.get(1)+1);
        System.out.println(map.get(0));
        System.out.println(map.get(1));
        System.out.println(map.containsKey(1));

    }
    @Test
    public void test2()
    {
        String str = "sdsdafv1,";
        str.contains("sd");
        str.length();
        System.out.println(str.toUpperCase());
        System.out.println(str);
        System.out.println(str.substring(1, str.length()));
        char c = 0;
        System.out.println(c);
//        Map<Object, Object> map1 = new HashMap<>();
//        map1.


        HashMap<Character, Integer> map = new HashMap<>();
        map.put((char) ('a' + 1), 3);
        map.put('d', 3);
        map.put((char) 0,4);
        map.put((char) 56,6);
        System.out.println(map);
//        Iterator<Character> it = map.keySet().iterator();
//        while (it.hasNext())
//        {
//            Character c = it.next();
//            System.out.println(map.get(c));
//        }
//        for(char c:map.keySet())
//            System.out.println(c);
//    }
    }
    public int fun(int x,int y)
    {
        return x+y;
    }
    @Test
    public void test3()
    {
        int x=1;
//        int y=(x++)+x;
        int y=5;
        int z=fun(x,y),z1=fun(3,6);
        fun(x,y);
        System.out.println(x+" "+y);
        Integer a = new Integer(1);
        Integer b = new Integer(5);
        fun(a,b);
        System.out.println(a+" "+b);
    }
    @Test
    public void test4()
    {
        C c=new C();
        System.out.println(c.name);
        c.name="";
        System.out.println(c.name);
    }

}
class C
{
    int id;
    String name;
}