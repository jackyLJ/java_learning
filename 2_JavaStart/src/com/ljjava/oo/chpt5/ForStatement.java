package com.ljjava.oo.chpt5;

public class ForStatement {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("forѭ�������" + i);
		}

		/*
		 * �쳯��һ����ؤ�պ飬ȥ����ҪǮ ��һ��Ҫ��1��Ǯ �ڶ���Ҫ��2��Ǯ ������Ҫ��4��Ǯ ������Ҫ��8��Ǯ
		 * 
		 * �Դ�����
		 * 
		 * ���⣺ ����ؤ��10�죬�����Ƕ��٣�
		 */
		// ��һ�ַ�����ͨ����λ�ķ���
		int money = 0;
		int dayMoney = 0;
		for (int j = 1; j <= 10; j++) {
			dayMoney = 1 << (j - 1);
			money += dayMoney;
			System.out.println("��" + j + "��Ҫ��" + dayMoney);
		}

		System.out.println("10��һ��Ҫ�˶���Ǯ��" + money);
		System.out.println("----------------------------");

		// �ڶ��ַ�����������ÿ��Ҫ��Ǯ�ֱ���㣬�Ƚ�����
		int money2 = 0;
		int dayMoney2 = 0;
		int j2 = 1;
		for (int i2 = 1; j2 <= 10;) {
			dayMoney2 = i2;
			System.out.println("��" + j2 + "��Ҫ��" + dayMoney2);

			money2 += dayMoney2;
			j2++;
			i2 = i2 * 2;
		}
		System.out.println("10��һ��Ҫ�˶���Ǯ��" + money2);
	}
}
