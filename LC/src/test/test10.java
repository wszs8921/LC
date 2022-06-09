package test;

import java.util.Scanner;

/**
 * @author shkstart
 * @create 2022-04-11 19:25
 */
public class test10
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int n,x,y;
        n=cin.nextInt();
        x=cin.nextInt();
        y=cin.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<=n-1;i++)
            nums[i]=cin.nextInt();
        int min=-1;
        for(int i=0;i<=n-1;i++)
        {
            if(isHarder(nums,i,x,y))
            {
                min = i;
                break;
            }
        }
        System.out.println(min+1);

    }
    public static boolean isHarder(int[] nums,int index,int x,int y)
    {
        int left=Math.max(index-x,0);
        int right=Math.min(index+y,nums.length-1);
        for(int i=left;i<=right;i++)
        {
            if(nums[i]<nums[index])
                return false;
        }
        return true;
    }
}
