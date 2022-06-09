package test1;

/**
 * @author adwstart
 * @create 2022-06-06 17:44
 */
public class PathInMatrix
{
    private char[][] board;
    private boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        this.board=board;
        this.visited= new boolean[board.length][board[0].length];
        for(int i=0;i<=board.length-1;i++)
            for(int j=0;j<=board[0].length-1;j++)
            {
                boolean flag = dfs(i, j, word, 0);
                if(flag==true)
                    return true;
            }
        return false;
    }
    public boolean dfs(int i,int j,String word,int index)
    {
        visited[i][j]=true;
        if(word.charAt(index)!=board[i][j])
        {
            visited[i][j]=false;
            return false;
        }
        if(index==word.length()-1)
        {
            visited[i][j]=false;
            return true;
        }
        int[][] dirs=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        boolean res=false;
        for(int[] dir:dirs)
        {
            int row=i+dir[0];
            int col=j+dir[1];
            if(row>=0&&row<=board.length-1&&col>=0&&col<=board[0].length-1&&visited[row][col]==false)
            {
                boolean flag = dfs(row, col, word, index + 1);
                if(flag==true)
                {
                    res=true;
                    break;
                }
            }
        }
        visited[i][j]=false;
        return res;
    }









}
