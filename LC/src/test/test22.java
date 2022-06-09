package test;

import java.util.*;

/**
 * @author adwstart
 * @create 2022-05-05 18:27
 */
public class test22
{
    public String[][] partition(String s) {

        ArrayList<String> preStrs = new ArrayList<>();
        ArrayList<List<String>> res = new ArrayList<>();
        dfs(s,0,preStrs,res);
        String[][] strings = new String[res.size()][];
        for(int i=0;i<=res.size()-1;i++)
        {
            String[] strs_i = new String[res.get(i).size()];
            for (int j=0;j<=strs_i.length-1;j++)
                strs_i[j]=res.get(i).get(j);
            strings[i]=strs_i;
        }

        return strings;
    }
    public void dfs(String str, int cur, List<String> preStrs,List<List<String >> res)
    {
        if(cur<=str.length()-1)
        {
            for(int i=cur;i<=str.length()-1;i++)
            {
                String substr=str.substring(cur,i+1);
                if(isHuiwen(substr))
                {
                    preStrs.add(substr);
                    dfs(str,i+1,preStrs,res);
                    preStrs.remove(preStrs.size()-1);
                }
            }
        }
        else
        {
            res.add(new ArrayList<>(preStrs));
        }
    }
    public boolean isHuiwen(String str)
    {
        for(int i=0,j=str.length()-1;i<j;i++,j--)
        {
            if(str.charAt(i)!=str.charAt(j))
                return false;
        }
        return true;
    }
}
