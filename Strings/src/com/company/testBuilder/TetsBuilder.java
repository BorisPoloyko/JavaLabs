package com.company.testBuilder;

public class TetsBuilder {
    public static void testBuilder(){
        long m = System.currentTimeMillis();
        String str = "";
        for(int i = 0; i < 100000; i++)
        {
            str+='a';
        }
        System.out.println("Время работы без StringBuilder: " + (System.currentTimeMillis() - m ) + " милисекунд");

        long n = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 100000; i++)
        {
            sb.append('a');
        }
        String str1 = new String(sb);
        System.out.println("Время работы с StringBuilder: " + (System.currentTimeMillis() - n) + " милисекунд");
    }
}
