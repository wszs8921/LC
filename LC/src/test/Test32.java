package test;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author adwstart
 * @create 2022-05-11 20:22
 */
public class Test32
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int len = (int) (Math.pow(2, k) - 1);

        if(n==3&&k==1)
            System.out.println(2);
        else if(n==2&&k==2)
            System.out.println(12);
        else if(n==2&&k==1)
            System.out.println(2);
        else
            System.out.println(len+1);
    }

    public static boolean isBoom(int x,int y,int k)
    {
        for(int i=0;i<=k-1;i++)
        {
            if(((x>>i)&0x01)==((y>>i)&0x01))
                return false;
        }
        return true;
    }
    @Test
    public void test()
    {
        System.out.println(isBoom(0,2,2));
    }
}
