package test1;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author adwstart
 * @create 2022-05-13 11:31
 */
public class Test4
{
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int max=0;
        for(int i=0;i<=grid.length-1;i++)
        {
            for (int j=0;j<=grid[0].length-1;j++)
            {
                if(grid[i][j]==1&&visited[i][j]==false)
                {
                    int[] count = new int[]{0};
                    dfs(i,j,grid,visited,count);
                    max=Math.max(max,count[0]);
                }
            }
        }
        return max;

    }
    public void bfs(int x,int y,int[][] grid,boolean[][] visited,int[] count)
    {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y]=true;
        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};

        while (!queue.isEmpty())
        {
            int[] node = queue.remove();
            count[0]++;

            for(int i=0;i<=3;i++)
            {
                int r=node[0]+dirs[i][0];
                int c=node[1]+dirs[i][1];
                if(r>=0&&r<=grid.length-1&&c>=0&&c<=grid[0].length-1)
                    if(grid[r][c]==1&&!visited[r][c])
                    {
                        queue.add(new int[]{r,c});
                        visited[r][c]=true;
                    }

            }
        }
    }
    public void dfs(int x,int y,int[][] grid,boolean[][] visited,int[] count)
    {
        visited[x][y]=true;
        count[0]++;
        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        for(int i=0;i<=3;i++)
        {
            int r=x+dirs[i][0];
            int c=y+dirs[i][1];
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














