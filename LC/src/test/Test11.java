package test;

import java.util.Scanner;

/**
 * @author shkstart
 * @create 2022-04-11 20:24
 */
public class Test11
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        String str = cin.next();
        int count=0;
        for(int i=0;i<=n-1;i++)
            for(int j=i;j<=n-1;j++)
            {
                String subStr = str.substring(i, j + 1);
                double val = Double.parseDouble(subStr);
                if(val%m==0)
                    count++;
            }
        System.out.println(count);
    }
}
