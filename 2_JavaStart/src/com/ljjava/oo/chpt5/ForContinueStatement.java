package com.ljjava.oo.chpt5;

public class ForContinueStatement {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				continue; // �����ż�����Ͳ�ִ�к������룬ֱ�ӽ�����һ��ѭ��
			System.out.println(i);
		}

		System.out.println("---------------------------------");

		// ��ӡ1~100֮�������������������3��5�ı����������
		for (int j = 1; j <= 100; j++) {
			if (j % 3 == 0 || j % 5 == 0)
				continue;
			System.out.println(j);
		}

		// Practice:
		/*
		 * ��������������3000������ƽʱ������ÿ��������1000��Ǯ����Ͷ�ʡ�
		 * 
		 * Ȼ��������������� ����Ʊ�ͻ��� 21������ŵ���ͨ�����ﵽ��ÿ��20%��Ͷ�ʻر��ʡ�
		 * 
		 * ��ô�������ˣ���ÿ����Ͷ��1000��Ǯ�Ľ��࣬����Ͷ�ʶ����꣬������ﵽ100�� ���������㰴��ÿ��12000Ͷ����㣬������ÿ�¼�Ϣ��
		 * 
		 * ������ʽ�� F = p* ( (1+r)^n ); F �������� p ���� r ������ n ���˶�����
		 * 
		 * �����龰һ�� p = 10000 r = 0.05 n = 1
		 * 
		 * ����� ������10000 ��������5% ����һ�� 1�� �������� 10000*( (1+0.05)^1 ) = 10500
		 * 
		 * �����龰���� p = 10000 r = 0.05 n = 2
		 * 
		 * ����� ������10000 ��������5% �������� �������� 10000*( (1+0.05)^2 ) = 11025
		 */
		double income = 0;
		int yearInput = 12000; // ÿ�껹�����12000
		double rate = 1;
		int y = 1;
		for (; income < 1000000; y++) {
			rate *= (1 + 0.2);
			if (y == 1) {
				income = yearInput * rate;
			} else {
				income = income * rate + yearInput * (1 + 0.2);
			}
			System.out.println("��" + y + "�꣬������Ϊ��" + income);
		}

		System.out.println("Ͷ��������ﵽ100����Ҫ��" + y + "��");

		System.out.println("---------------------------------");

		int y2 = 2;
		double s1 = 1.2;
		int sum = (int) (12000 * 1.20);
		while (true) {
			s1 *= (1 + 0.2);
			double p = 12000 * s1;
			sum += p;
			if (sum >= 1000000) {
				break;
			}
			y2++;
		}
		System.out.println("������ﵽ100��,��" + y2 + "��");
	}
}
