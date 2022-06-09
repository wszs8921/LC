package test;

import java.util.Scanner;

/**
 * @author adwstart
 * @create 2022-05-13 0:40
 */
public class ScanTest3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String str = scanner.next();
        System.out.println(x+"  "+str);
    }
}
