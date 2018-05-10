package com.company;

import java.util.Scanner;

public class printinstringnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Message = sc.nextLine();
        int count = 0;
        char[] aaa = Message.toCharArray();
        int[] big = new int[26];
        int[] small = new int[26];
        for (int i = 0; i < aaa.length; i++) {
            if (aaa[i] >= 'A' && aaa[i] <= 'Z') {
                big[aaa[i] - 'A']++;
            }
            if (aaa[i] >= 'a' && aaa[i] <= 'z') {
                small[aaa[i] - 'a']++;
            }

            if (aaa[i] == ' ')
            { count++; }}
        System.out.println(count+1);
        for (int i=0;i<26;i++)
        { if (small[i]>0)
        {
            System.out.println((char) (i + 'a') + ":" + small[i]);
        }
        }}}


