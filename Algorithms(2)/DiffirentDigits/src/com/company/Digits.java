package com.company;

public class Digits
{
    public static boolean isDiff(int a)
    {
        String str = Integer.toString(a);
        for (int i = 0; i < str.length(); i++)
        {
            for (int j = 0; j < str.length();j++)
            {
                if (str.charAt(i) == str.charAt(j) && i != j)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static int findDiffDigits(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            if (isDiff(a[i]))
                return a[i];
        }
        return -1;
    }

}
