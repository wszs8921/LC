package test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author adwstart
 * @create 2022-05-05 17:20
 */
public class test21
{
    @Test
    public void test()
    {
        String str=new String("abc");
        changeStr(str);
        System.out.println(str);
    }
    public void changeStr(String str)
    {
        str=str+"111";
    }

    @Test
    public void test2()
    {
        Map<Integer,String > map=new HashMap<>();
        map.put(1,"aaa");
        map.put(2,"bbb");
        map.put(3,"ccc");
        Set<Integer> keySet = map.keySet();
        for(int key:keySet)
        {
            System.out.println(map.get(key));
        }
    }
    @Test
    public void test3()
    {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"aaa");
        map.put(null,"nnn");
        System.out.println(map.get(null));
    }
    @Test
    public void test4()
    {
        int[] arr = new int[5];
        System.out.println(arr[3]);
        String[] strs = new String[5];
        System.out.println(strs[2]);
        int[][] ints = new int[5][5];
        System.out.println(ints[2][2]+" "+ints[2]);
    }
    @Test
    public  void test5()
    {
        Integer x=new Integer(1);
        change(x);
        System.out.println(x);
        String str="aaa";
    }
    public static void change(Integer x)
    {
        x=x+1;
    }

    @Test
    public void test6()
    {
        boolean[] booleans = new boolean[]{};
        System.out.println(booleans[0]);
        System.out.println(booleans[1]);
    }
}
