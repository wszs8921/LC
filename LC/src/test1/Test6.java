package test1;

import java.util.ArrayList;

/**
 * @author adwstart
 * @create 2022-05-13 18:55
 */
public class Test6
{
    public int[][] updateMatrix(int[][] mat) {
        int[][] dis = new int[mat.length][mat[0].length];
        ArrayList<int[]> arr0 = new ArrayList<>();
        for(int i=0;i<=mat.length-1;i++)
            for(int j=0;j<=mat[0].length-1;j++)
            {
                if(mat[i][j]==0)
                {
                    arr0.add(new int[]{i,j});
                    dis[i][j]=0;
                }
                else
                    dis[i][j]=Integer.MAX_VALUE;
            }

        for(int k=0;k<=arr0.size()-1;k++)
        {
            for(int i=0;i<=mat.length-1;i++)
                for(int j=0;j<=mat[0].length-1;j++)
                {
                    if(mat[i][j]!=0)
                    {
                        int dx=Math.abs(i-arr0.get(k)[0]);
                        int dy=Math.abs(j-arr0.get(k)[1]);
                        dis[i][j]=Math.min(dis[i][j],dx+dy);
                    }
                }
        }
        return dis;
    }
}
