package com.ljjava.oo.chpt5;

import java.util.Scanner;

public class WhileStatement {
	public static void main(String[] args) {
		int i = 0; // ��ӡ0��4
		while (i < 5) {
			System.out.println(i);
			i++;
		}

		int j = 0; // ��ӡ0��4
		do {
			System.out.println(j);
			j++;
		} while (j < 5);

		System.out.println("������һ��������");
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();

		int result = 1;
		int n = 0;
		while (n < m) {
			result *= m - n;
			n++;
		}

		System.out.println("����" + m + "�׳�Ϊ:" + result);
		
		//������д������һ��
		while (m > 0) {
			m *= m--;			
		}
		System.out.println("�׳�Ϊ:" + result);
	}
}
