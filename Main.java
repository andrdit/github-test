package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        byte[] aByte = {14,15};
        String s;// = aByte.toString();
        AsciiCharSequence acs = new AsciiCharSequence(aByte);
        System.out.println(acs.toString());
        System.out.println((char) aByte[1]);
        System.out.println(Arrays.toString(aByte));

        int a = aByte.length;
        System.out.println(a);
        System.out.println(acs.length());

        System.out.println(acs.charAt(1));

        s = acs.subSequence(0,1);
        s.subSequence()

    }

}


