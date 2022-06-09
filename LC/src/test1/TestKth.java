package test1;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author adwstart
 * @create 2022-05-17 14:00
 */
public class TestKth
{
    @Test
    public void test()
    {
        KthLargest kthLargest = new KthLargest(3, new int[]{5, 9, 11, 2, 3});
        System.out.println(kthLargest.add(12));
    }

    @Test
    public void test2()
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3,5);
        System.out.println(list);
    }
}
