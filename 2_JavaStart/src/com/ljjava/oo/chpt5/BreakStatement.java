package com.ljjava.oo.chpt5;

public class BreakStatement {
	public static void main(String[] args) {
		// ��ӡ����
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + ":" + j);
				if (0 == j % 2) {
					break;// �����˫����������ǰѭ��
				}
			}
		}

		System.out.println("--------------------------");

		// ��������ѭ����������break
		boolean breakoutFlag = false; // �Ƿ���ֹ�ⲿѭ���ı��
		for (int m = 1; m < 10; m++) {
			for (int n = 1; n < 10; n++) {
				System.out.println(m + ":" + n);
				if (0 == n % 2) {
					breakoutFlag = true;// ��ֹ�ⲿѭ��
					break;
				}
			}

			if (breakoutFlag) { // �ж��Ƿ���ֹ�ⲿѭ��
				break;
			}
		}

		System.out.println("--------------------------");

		// ���ⲿѭ����ǰһ�У����ϱ�ǩ
		// ��break��ʱ��ʹ�øñ�ǩ
		// ���ܴﵽ�������ѭ����Ч��
		outloop: for (int x = 2; x < 10; x++) {
			for (int y = 1; y < 10; y++) {
				System.out.println(x + ":" + y);
				if (0 == y % 2) {
					break outloop;
				}
			}
		}
	}
}
