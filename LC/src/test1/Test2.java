package test1;

import java.util.ArrayList;

/**
 * @author adwstart
 * @create 2022-05-12 12:25
 */
public class Test2
{
    public boolean isInterleave(String s1, String s2, String s3) {
        boolean[][] dp = new boolean[s1.length()+1][s2.length()+1];
        dp[0][0]=true;
        for(int i=1;i<=s2.length();i++)
        {
            if(s2.substring(0,i).equals(s3.substring(0,i)))
                dp[0][i]=true;
            else
                dp[0][i]=false;
        }
        for(int i=1;i<=s1.length();i++)
            dp[i][0]=s1.substring(0,i).equals(s3.substring(0,i));
        for(int i=1;i<=s1.length();i++)
            for(int j=1;j<=s2.length();j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1)&&s2.charAt(j-1)==s3.charAt(i+j-1))
                    dp[i][j]=dp[i-1][j]||dp[i][j-1];
                else if(s1.charAt(i-1)==s3.charAt(i+j-1))
                    dp[i][j]=dp[i-1][j];
                else if(s2.charAt(j-1)==s3.charAt(i+j-1))
                    dp[i][j]=dp[i][j-1];
                else
                    dp[i][j]=false;
            }
        return dp[s1.length()][s2.length()];
    }
}















