package com.ljjava.oo;

import java.util.Scanner;

// ��Ԫ������
public class TenaryOperation {
	public static void main(String[] args) {
		System.out.println("���������ڼ���1~7");
		Scanner s = new Scanner(System.in);
		int day = s.nextInt();

		String text = day < 6 ? "������" : "��ĩ";

		System.out.println("����������" + day + "����" + text);
	}
}
