package test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author shkstart
 * @create 2022-04-11 12:34
 */
public class test8
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext())
        {
            int m = cin.nextInt();
            int n = cin.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i=m;i<=n;i++)
            {
                int x,y,z;
                x=i/100;
                y=i%100/10;
                z=i%10;
                if(Math.pow(x,3)+Math.pow(y,3)+Math.pow(z,3)==i)
                    arr.add(i);
            }
            if(arr.size()==0)
                System.out.println("no");
            else
            {
                for(int i:arr)
                {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
    }
}