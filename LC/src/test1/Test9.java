package test1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author adwstart
 * @create 2022-05-15 19:20
 */
public class Test9
{
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, new Comparator<int[]>()
        {
            @Override
            public int compare(int[] o1, int[] o2)
            {
                return o1[0]-o2[0];
            }
        });
        ArrayList<int[]> res = new ArrayList<>();
        int i=0;
        while (i<=intervals.length-1)
        {
            int[] tempRange = new int[]{intervals[i][0],intervals[i][1]};
            int j=i+1;
            for(;j<=intervals.length-1;j++)
            {
                if(intervals[j][0]>=tempRange[0]&&intervals[j][0]<=tempRange[1])
                {
                    tempRange[1]=Math.max(tempRange[1],intervals[j][1]);
                }
                else
                {
                    break;
                }
            }
            res.add(tempRange);
            i=j;
        }
        int[][] resArr = new int[res.size()][];
        for(int j=0;j<=res.size()-1;j++)
        {
            resArr[j]=res.get(j);
        }
        return resArr;
    }
    @Test
    public void test()
    {
        int[][] arr = new int[][]{{2,6,3},{5,11,1}};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Integer.compare(1,2);
    }

}
