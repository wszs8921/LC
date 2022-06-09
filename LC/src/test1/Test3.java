package test1;

import org.junit.Test;
import sun.security.krb5.internal.rcache.DflCache;

import java.util.LinkedList;

/**
 * @author adwstart
 * @create 2022-05-12 16:18
 */
public class Test3
{
    public int maxAreaOfIsland(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int max=0;
        int n=0;
        for(int i=0;i<=rows-1;i++)
        {
            for(int j=0;j<=cols-1;j++)
            {
                int[] count = new int[]{0};
                if(grid[i][j]==1&&!visited[i][j])
                {
                    dfs(i,j,grid,visited,count);
                    n++;
                }

                max=Math.max(max,count[0]);
            }
        }
        System.out.println(n);
        return max;
    }
    public void bfs(int i,int j,int[][] grid,boolean[][] visited,int[] count)
    {
        LinkedList<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i,j});
        visited[i][j]=true;
        int[][] dir = new int[][]{{1,0},{-1,0},{0,-1},{0,1}};

        while (!queue.isEmpty())
        {
            int[] node = queue.remove();
            count[0]++;

            for(int k=0;k<=3;k++)
            {
                int r=node[0]+dir[k][0];
                int c=node[1]+dir[k][1];
                if(r>=0&&r<=grid.length-1&&c>=0&&c<=grid[0].length-1)
                    if(grid[r][c]==1&&visited[r][c]==false)
                    {
                        queue.add(new int[]{r,c});
                        visited[r][c]=true;
                    }
            }
        }
    }
    public void dfs(int i,int j,int[][] grid,boolean[][] visited,int[] count)
    {
        visited[i][j]=true;
        count[0]++;
        int[][] dir = new int[][]{{1,0},{-1,0},{0,-1},{0,1}};
        for(int k=0;k<=3;k++)
        {
            int r=i+dir[k][0];
            int c=j+dir[k][1];
            if(r>=0&&r<=grid.length-1&&c>=0&&c<=grid[0].length-1)
                if(grid[r][c]==1&&!visited[r][c])
                    dfs(r,c,grid,visited,count);
        }
    }


    @Test
    public void test()
    {
        int[][] grid = new int[][]{{0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        int[][] grid2 = new int[][]{{1,1}};
        System.out.println(maxAreaOfIsland(grid));
    }
}











