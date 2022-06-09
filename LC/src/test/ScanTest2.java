package test;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author adwstart
 * @create 2022-05-09 14:32
 */
public class ScanTest2
{
    public static void ma1in(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextInt())
        {
            int i = scanner.nextInt();
            System.out.println(i);
        }
    }
    @Test
    public void testPrint()
    {
        int x=9;
        double y=6.3265;
        System.out.printf("%2d,%3d,%.2f,%f,aaa%n\n",x,5,5.0,y);
        double[] arr = new double[]{3.4,6.4,8.4};
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.printf("%.3f ",arr[i]);
        }
    }
    @Test
    public void test3NN()
    {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String str = scanner.next();
        System.out.println(x+"  "+str);
    }
}
