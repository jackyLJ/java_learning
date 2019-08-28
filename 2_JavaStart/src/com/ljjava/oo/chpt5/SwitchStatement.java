package com.ljjava.oo.chpt5;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		int day = 3;
		switch (day) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
		default:
			System.out.println("这是什么鬼！");
		}

		System.out.println("请输入1到12月份：");

		int month = 0;
		while (!(month < 0)) {
			Scanner s = new Scanner(System.in);
			month = s.nextInt();

			switch (month) {
			case 1:
			case 2:
			case 3:
				System.out.println("春天");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("夏天");
				break;
			case 7:
			case 8:
			case 9:
				System.out.println("秋天");
				break;
			case 10:
			case 11:
			case 12:
				System.out.println("冬天");
				break;
			default:
				System.out.println("未知季节");
			}
		}
		
		System.out.println("exited!");
	}
}
