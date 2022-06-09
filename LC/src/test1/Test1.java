package test1;

import org.junit.Test;

import java.io.FileInputStream;
import java.util.ArrayList;

/**
 * @author adwstart
 * @create 2022-05-12 11:11
 */
public class Test1
{
    public boolean isInterleave(String s1, String s2, String s3) {
        ArrayList<Boolean> eqs = new ArrayList<>();
        dfs(s1,s2,s3,0,0,"",eqs);
        if(eqs.size()!=0)
            return true;
        return false;

    }
    public void dfs(String s1, String s2, String s3, int i, int j, String res, ArrayList<Boolean> eqs)
    {
        if(i<=s1.length()-1||j<=s2.length()-1)
        {
            if(i<=s1.length()-1)
            {
                dfs(s1,s2,s3,i+1,j,res+s1.charAt(i),eqs);
            }
            if(j<=s2.length()-1)
            {
                dfs(s1,s2,s3,i,j+1,res+s2.charAt(j),eqs);
            }
        }
        else
        {
            if(res.equals(s3))
                eqs.add(true);
        }
    }
    @Test
    public void test()
    {

        System.out.println(isInterleave("aabcc","dbbca","aadbbbaccc"));
    }
}
