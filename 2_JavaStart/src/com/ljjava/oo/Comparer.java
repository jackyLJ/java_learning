package com.ljjava.oo;

import java.util.Scanner;

public class Comparer {
	public static void main(String[] args) {
		System.out.println("������2��������");
		Scanner scanner = new Scanner(System.in);
		int firstInt = scanner.nextInt();
		
		System.out.println("��һ������Ϊ��" + firstInt);
		int secInt = scanner.nextInt();
		System.out.println("�ڶ�������Ϊ��" + secInt);

		System.out.println("�Ƚ�" + firstInt + ">" + secInt + "��" + (firstInt > secInt));
		System.out.println("�Ƚ�" + firstInt + ">=" + secInt + "��" + (firstInt >= secInt));
		System.out.println("�Ƚ�" + firstInt + "<" + secInt + "��" + (firstInt <= secInt));
		System.out.println("�Ƚ�" + firstInt + "<=" + secInt + "��" + (firstInt <= secInt));
		System.out.println("�Ƚ�" + firstInt + "<=" + secInt + "��" + (firstInt <= secInt));
		System.out.println("�Ƚ�" + firstInt + "==" + secInt + "��" + (firstInt == secInt));
		System.out.println("�Ƚ�" + firstInt + "!=" + secInt + "��" + (firstInt != secInt));
	}
}
