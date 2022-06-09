package test1;

/**
 * @author adwstart
 * @create 2022-05-30 11:22
 */
public class Test22
{
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int rows=matrix.length,cols=matrix[0].length;
        int i=0,j=cols-1;
        while (i>=0&&i<=rows-1&&j>=0&&j<=cols-1)
        {
            if(matrix[i][j]==target)
                break;
            else if(matrix[i][j]>target)
                j--;
            else
                i++;
        }
        if(i>=0&&i<=rows-1&&j>=0&&j<=cols-1)
            return true;
        else
            return false;
    }
}
