package test;


import org.junit.Test;

import java.util.*;

/**
 * @author shkstart
 * @create 2022-04-11 20:50
 */
public class Test12
{
    public static void main(String[] args)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(3);
        list.remove((Integer) 1);
        list.sort(new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                return Integer.compare(o1,o2);
            }
        });
        System.out.println(list);
    }
    @Test
    public void test()
    {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Integer[] arr1 = new Integer[]{1,2,3};
        Integer[] arr2 = new Integer[]{1,1,3};

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(arr1));
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(arr2));

        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);
        System.out.println(list);


        HashSet<ArrayList<Integer>> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println(list);
    }
}
