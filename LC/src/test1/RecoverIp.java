package test1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adwstart
 * @create 2022-05-27 18:14
 */
public class RecoverIp
{
    public List<String> restoreIpAddresses(String s) {
        ArrayList<String> res = new ArrayList<>();
        dfs(s,0,0,"","",res);
        return res;
    }
    public void dfs(String s,int index,int segIndex,String seg,String ip,List<String> res)
    {
        if(index<=s.length()-1)
        {
            char c=s.charAt(index);
            if(isValidSeg(seg+c))
            {
                dfs(s,index+1,segIndex,seg+c,ip,res);
            }
            if(segIndex<3&&seg.length()>0)
            {
                dfs(s,index+1,segIndex+1,""+c,ip+seg+".",res);
            }
        }
        else
        {
            if(segIndex==3)
                res.add(ip+seg);
        }
    }
    public boolean isValidSeg(String seg)
    {
        if(seg.equals("0"))
            return true;
        else if(seg.charAt(0)=='0')
            return  false;
        else
        {
            if(Integer.parseInt(seg)<=255&&Integer.parseInt(seg)>=0)
                return true;
            else
                return false;
        }
    }

    @Test
    public void test()
    {
        System.out.println(restoreIpAddresses("0000"));
    }







}
