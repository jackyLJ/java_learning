package com.ljjava.oo.chpt6;

public class InitArray {
    public static void main(String[] args){
        // 声明一个数组
        int[] a;

        a= new int[5];

        int[] b= new int[5]; // 声明的同时，指向一个数组

        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;

        System.out.println(a.length);

        System.out.println("a[4]="+a[4]);

        a[4] = 100;

        System.out.println("a[4] after update"+a[4]);
    }
}
