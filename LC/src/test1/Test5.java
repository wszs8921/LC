package test1;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author adwstart
 * @create 2022-05-13 13:21
 */
public class Test5
{
    public boolean isBipartite(int[][] graph) {

        int[] colors = new int[graph.length];
        for(int i=0;i<=colors.length-1;i++)
            colors[i]=-1;
        for(int i=0;i<=colors.length-1;i++)
        {
            if(colors[i]==-1)
            {
//                boolean[] res = new boolean[1];
//                bfs(i,graph,colors,res);
//                if(res[0]==false)
//                    return false;
                boolean[] res = new boolean[]{true};
                dfs(i,graph,colors,res,0);
                if(res[0]==false)
                    return false;
            }
        }
        return true;
    }

    public void bfs(int x,int[][] graph,int[] colors,boolean[] res)
    {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        colors[x]=0;
        while (!queue.isEmpty())
        {
            Integer nodeNum = queue.remove();
            for(int i=0;i<=graph[nodeNum].length-1;i++)
            {
                if(colors[nodeNum]==colors[graph[nodeNum][i]])
                {
                    res[0]=false;
                    return;
                }
            }
            for(int neiNum:graph[nodeNum])
            {
                if(colors[neiNum]==-1)
                {
                    queue.add(neiNum);
                    colors[neiNum]=1-colors[nodeNum];
                }
            }
        }
        res[0]=true;
    }
    public void dfs(int x,int[][] graph,int[] colors,boolean[] res,int color)
    {
        colors[x]=color;
        for(int i=0;i<=graph[x].length-1;i++)
        {
            if(colors[x]==colors[graph[x][i]])
                res[0]=false;
        }
        for(int neiNum:graph[x])
        {
            if(colors[neiNum]==-1)
            {
                dfs(neiNum,graph,colors,res,1-color);
            }
        }
    }
}














