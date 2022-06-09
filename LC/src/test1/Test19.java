package test1;

import org.junit.Test;

/**
 * @author adwstart
 * @create 2022-05-27 23:03
 */
public class Test19
{
    @Test
    public void testEqual()
    {
        String str="a";
        String str2=""+str;
        String str3 = new String("a");
        System.out.println(str=="a");
        System.out.println(str2=="a");
        System.out.println(str3=="a");
    }
}
