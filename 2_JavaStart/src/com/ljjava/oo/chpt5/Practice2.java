package com.ljjava.oo.chpt5;

/*
 * ˮ�ɻ������壺
 * 1. һ����3λ��
 * 2. ÿһλ��������������ǡ�����������������153=1*1*1+5*5*5+3*3*3
 * 
 * Ѱ�����е�ˮ�ɻ���
 */
public class Practice2 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					int sum = k + 10 * j + i * 100;
					int target = i * i * i + j * j * j + k * k * k;
					if (sum > 100 && sum == target) {
						System.out.println(sum);
					}
				}
			}
		}

		System.out.println("-------------------");

		// ����һ�ֽⷨ
		for (int i2 = 100; i2 <= 999; i2++) {
			int x = i2 / 100;
			int y = i2 / 10 % 10;
			int z = i2 % 10;
			if (x * x * x + y * y * y + z * z * z == i2)
				System.out.println(i2);
		}
	}
}
