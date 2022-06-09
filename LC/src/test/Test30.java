package test;

import java.util.Scanner;

/**
 * @author adwstart
 * @create 2022-05-11 19:03
 */
public class Test30
{
    public static void main(String[] args) {
        // please define the JAVA input here. For example: Scanner s = new Scanner(System.in);
        // please finish the function body here.
        // please define the JAVA output here. For example: System.out.println(s.nextInt());
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<=n-1;i++)
            nums[i]=scanner.nextInt();
        int[] bless = new int[n];
        for(int i=0;i<=n-1;i++)
        {
//            int count=0;
//            for(int j=i+1;j<=n-1;j++)
//            {
//                if(nums[j]<nums[i])
//                    count++;
//            }
            for(int j=0;j<=i;j++)
                if(nums[i]<nums[j])
                    bless[j]++;
//            bless[i]=count;
        }
        for(int i=0;i<=n-2;i++)
            System.out.print(bless[i]+" ");
        System.out.print(bless[n-1]);
    }
}
