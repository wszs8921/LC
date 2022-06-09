package test;

import java.util.Scanner;

/**
 * @author shkstart
 * @create 2022-04-11 11:39
 */
public class test7
{
    public static void main(String[] args)
    {
//        Scanner cin = new Scanner(System.in);
//        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
//        while (cin.hasNextLine())
//        {
//            String str = cin.nextLine();
//            ArrayList<Integer> row = new ArrayList<>();
//            String[] strRow = str.split(" ");
//            for(int i=0;i<=strRow.length-1;i++)
//            {
//                row.add(Integer.parseInt(strRow[i]));
//            }
//            arr.add(row);
//        }
//        System.out.println("jieshule");


//        Scanner cin = new Scanner(System.in);
//        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
//        while (cin.hasNextLine())
//        {
//            ArrayList<Integer> row = new ArrayList<Integer>();
//            String line = cin.nextLine();
//            if (line.length() > 0)
//            {
//                String[] arrLine = line.split(" ");
//                for (int i = 0; i < arrLine.length; i++)
//                {
//                    row.add(Integer.parseInt(arrLine[i]));
//                }
//                arr.add(row);
//            }
//            if(line.equals(""))
//                break;
//        }
//        System.out.println("jieshule");
//        System.out.println(arr);

//        System.out.println("row and column:");
//        Scanner cin = new Scanner(System.in);
//        int r=cin.nextInt();
//        int c=cin.nextInt();
//        int[][] arr = new int[r][c];
//        for(int i=0;i<=r-1;i++)
//            for (int j=0;j<=c-1;j++)
//            {
//                arr[i][j] = cin.nextInt();
//            }
//        for (int i=0;i<=arr.length-1;i++)
//            for(int j=0;j<=arr[0].length-1;j++)
//                System.out.println(arr[i][j]);

        Scanner cin = new Scanner(System.in);
        boolean c;
        while(c=cin.hasNext())
        {
            System.out.println(c);
            String str=cin.next();
            System.out.println(str);
        }
    }
}
