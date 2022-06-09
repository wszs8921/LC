package test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author adwstart
 * @create 2022-05-06 12:41
 */
public class ScanTest
{
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<=dp.length-1;i++)
        {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[dp.length-1];
    }
    @Test
    public void test()
    {
        System.out.printf("%.3f,%.3f %.3f",3.5,6.2,7.4);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(scanner.hasNextLine())
        {
            String str = scanner.nextLine();
            str = str.replace("[", "").replace("]", "");
//            System.out.println(str);
            String[] strs = str.split(",");
            for(int i=0;i<=strs.length-1;i++)
            {
                int numi = Integer.parseInt(strs[i]);
                list.add(numi);
            }
//            System.out.println(list);
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<=arr.length-1;i++)
        {
            arr[i]=list.get(i);
        }
        for(int i=0;i<=arr.length-1;i++)
            System.out.println(arr[i]);
        System.out.println(new ScanTest().rob(arr));
    }
    @Test
    public void test2()
    {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext())
        {
            int i = scanner.nextInt();
            System.out.println(i);
        }
    }
}





















