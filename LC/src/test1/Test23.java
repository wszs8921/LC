package test1;

import org.junit.Test;

/**
 * @author adwstart
 * @create 2022-05-31 11:47
 */
public class Test23
{
    public String replaceSpace(String s) {
        String replace = s.replace(" ", "%20");
        return replace;
    }
    @Test
    public void test()
    {
        System.out.println(replaceSpace("a bb ccc"));
    }
}
