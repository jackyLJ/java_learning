package com.ljjava.oo.chpt6;

public class FindSmallestInArray {
    public static void main(String[] args){
         int[] a = new int[6];

        a[0] = (int)(Math.random()*100);
        a[1] = (int)(Math.random()*100);
        a[2] = (int)(Math.random()*100);
        a[3] = (int)(Math.random()*100);
        a[4] = (int)(Math.random()*100);
        a[5] = (int)(Math.random()*100);

        System.out.println("数组中的随机数值为：");
        for(int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("本练习的目的是，找出最小的一个值");

        int min = a[0];
        for(int i=1; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }

        System.out.println("最小值为："+min);
    }
}
