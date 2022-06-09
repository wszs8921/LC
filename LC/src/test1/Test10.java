package test1;

import org.junit.Test;

/**
 * @author adwstart
 * @create 2022-05-17 11:15
 */
public class Test10
{
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for(int i=0;i<=arr1.length-1;i++)
        {
            count[arr1[i]]++;
        }
        int k=0;
        for(int i=0;i<=arr2.length-1;i++)
        {
            for(int j=1;j<=count[arr2[i]];j++)
            {
                arr1[k]=arr2[i];
                k++;
            }
            count[arr2[i]]=0;
        }

        for(int i=0;i<=1000;i++)
        {
            for(int j=1;j<=count[i];j++)
            {
                arr1[k]=i;
                k++;
            }
            count[i]=0;
        }
        return arr1;
    }
    @Test
    public void test()
    {
        System.out.println(relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19},new int[]{2,1,4,3,9,6}));
    }
}
