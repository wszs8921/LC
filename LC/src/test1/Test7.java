package test1;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author adwstart
 * @create 2022-05-15 15:06
 */
public class Test7
{
    public int[][] updateMatrix(int[][] mat) {
        int[][] dis = new int[mat.length][mat[0].length];
        boolean[][] visited = new boolean[mat.length][mat[0].length];
        Queue<int[]> queue = new LinkedList<>();

        for(int i=0;i<=mat.length-1;i++)
            for(int j=0;j<=mat[0].length-1;j++)
            {
                if(mat[i][j]==0)
                {
                    queue.add(new int[]{i,j});
                    dis[i][j]=0;
                    visited[i][j]=true;
                }
            }
        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        while(!queue.isEmpty())
        {
            int[] cur = queue.remove();

            for(int i=0;i<=3;i++)
            {
                int r=cur[0]+dirs[i][0];
                int c=cur[1]+dirs[i][1];
                if(r>=0&&r<=mat.length-1&&c>=0&&c<=mat[0].length-1)
                    if(!visited[r][c])
                    {
                        queue.add(new int[]{r,c});
                        visited[r][c]=true;
                        dis[r][c]=dis[cur[0]][cur[1]]+1;
                    }
            }
        }
        return dis;
    }
}
















