package com.company.loop;
import java.util.Scanner;
public class type
{
    public static void main(String[] args)
    {
        System.out.print("enter a number of reapeted loop ");
        Scanner ali = new Scanner(System.in);
        int n = ali.nextInt();

        for (int j=1;j<=n;j++)
        {
            for (int i = 1; i <=10; i++)
            {
                System.out.printf("\n%d X %d = %d",j,i,j*i);
            }
            System.out.print("\n");
        }
    }
}
