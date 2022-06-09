package test1;

import org.junit.Test;

import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author adwstart
 * @create 2022-05-17 13:38
 */
public class KthLargest
{
    private PriorityQueue<Integer> heap;
    private int size;
    public KthLargest(int k, int[] nums) {
        size=k;
        heap=new PriorityQueue<Integer>();
        for(int num:nums)
        {
            if(heap.size()<size)
                heap.add(num);
            else if(num>heap.peek())
            {
                heap.remove();
                heap.add(num);
            }
        }
    }

    public int add(int val) {
        if(heap.size()<size)
            heap.add(val);
        else if(val>heap.peek())
        {
            heap.remove();
            heap.add(val);

        }
        return heap.peek();
    }
}


