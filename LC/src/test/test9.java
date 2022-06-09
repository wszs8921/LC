package test;

import java.util.Scanner;

/**
 * @author shkstart
 * @create 2022-04-11 18:26
 */
public class test9
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        long num = cin.nextLong();
        String str="";
        while (num!=0)
        {
            int x=(int)num%16;
            if(x>=0&&x<=9)
            {
                str=x+str;
            }
            else
            {
                char c=(char)(65+x-10);
                str=c+str;
            }
            num=num/16;
        }
        //System.out.println(str);
        int count=0;
        for(int i=0;i<=str.length()-1;i++)
        {
            if(str.charAt(i)>='A'&&str.charAt(i)<='F')
                count++;
        }
        System.out.println(count);
        func();
    }
    public static void func()
    {

    }
}
