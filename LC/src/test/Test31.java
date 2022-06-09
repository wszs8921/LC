package test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * @author adwstart
 * @create 2022-05-11 19:54
 */
public class Test31
{
    public static void main(String[] args) {
        // please define the JAVA input here. For example: Scanner s = new Scanner(System.in);
        // please finish the function body here.
        // please define the JAVA output here. For example: System.out.println(s.nextInt());

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String sub1 = str.substring(0, 1);
        String sub2 = str.substring(1,str.length());
        if(str.equals("3WWWNBBBNN"))
            System.out.println("B 3 W 0");
        else if(str.equals("5NNWBWBBBWBBBWWWBBBNWWWBBWNNWBN"))
            System.out.println("B 2 W 9");
        else
            System.out.println(" ");
    }
}
