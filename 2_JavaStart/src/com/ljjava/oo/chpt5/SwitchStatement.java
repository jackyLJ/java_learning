package com.ljjava.oo.chpt5;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		int day = 3;
		switch (day) {
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
		default:
			System.out.println("����ʲô��");
		}

		System.out.println("������1��12�·ݣ�");

		int month = 0;
		while (!(month < 0)) {
			Scanner s = new Scanner(System.in);
			month = s.nextInt();

			switch (month) {
			case 1:
			case 2:
			case 3:
				System.out.println("����");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("����");
				break;
			case 7:
			case 8:
			case 9:
				System.out.println("����");
				break;
			case 10:
			case 11:
			case 12:
				System.out.println("����");
				break;
			default:
				System.out.println("δ֪����");
			}
		}
		
		System.out.println("exited!");
	}
}
