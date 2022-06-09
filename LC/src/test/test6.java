package test;

import org.junit.Test;

/**
 * @author shkstart
 * @create 2022-04-04 21:09
 */
public class test6
{
    int resTest(int x)
    {
        if(x>0)
            return 1;
        else
            return 0;
    }
    void fun(int i)
    {
        i++;
    }
    void fun1(Integer i)
    {
        i++;
    }
    void fun2(int[] i)
    {
        i[0]++;
    }

    @Test
    public void test()
    {
        int x=2;
        Integer y=new Integer(2);
        int[] z = new int[]{2};
        fun(x);
        fun1(y);
        fun2(z);
        System.out.println(x+" "+y);
        System.out.println(z[0]);
    }
    @Test
    public void  test02()
    {
        String s="12";
        int i = Integer.parseInt(s);
        Integer.valueOf(s);
        System.out.println(i);
    }
    @Test
    public void test03()
    {
        String s="123";
        String s1=new String("123,456");
        String[] strs=s1.split(",");
        System.out.println(s=="123");
        System.out.println(strs[0]=="123");
        System.out.println(strs[0].equals("123"));
    }
    @Test
    public void test04()
    {
        int x=123;
        System.out.println((x + "").length());
        System.out.println(String.valueOf(x).length());
        System.out.println(Math.pow(2,3));
        int y= (int) Math.pow(x,3);
    }
    @Test
    public void test05()
    {
        System.out.println("aaa"+"\n"+"bbb");
    }
}
