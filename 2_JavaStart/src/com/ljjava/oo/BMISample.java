package com.ljjava.oo;

import java.util.Scanner;

public class BMISample {
	public static void main(String[] args) {
		System.out.println("�������������أ�KG������ߣ��ף�");
		Scanner s = new Scanner(System.in);
		float weight = s.nextFloat();
		System.out.println("��������Ϊ��" + weight + "KG");
		float height = s.nextFloat();
		System.out.println("�������Ϊ��" + height + "��");

		float bmi = weight / (height * height);
		System.out.println("����BMIָ��Ϊ��" + bmi);

		if (bmi < 18.5) {
			System.out.println("�������ع���");
		} else if (bmi >= 18.5 && bmi < 24) {
			System.out.println("����������������Χ");
		} else if (bmi >= 24 && bmi < 27) {
			System.out.println("�������ع���");
		} else if (bmi >= 27 && bmi < 30) {
			System.out.println("������ȷ���");
		} else if (bmi >= 30 && bmi < 35) {
			System.out.println("�����жȷ���");
		} else if (bmi >= 35) {
			System.out.println("�����ضȷ���");
		}
	}
}
