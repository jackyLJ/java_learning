package com.ljjava.oo;

public class BitOperator {
	public static void main(String[] args) {
		int i = 5;
		String b = Integer.toBinaryString(i); // ��ȡ�����Ķ����Ʊ��
		System.out.println(i + " binary:" + b);

		int j = 6;
		String c = Integer.toBinaryString(j);
		System.out.println(j + " binary:" + c);

		// λ��
		int k = i | j;
		String d = Integer.toBinaryString(k);
		System.out.println(i + "|" + j + "=" + k + ", binary:" + d);

		// λ��
		int m = i & j;
		String e = Integer.toBinaryString(m);
		System.out.println(i + "&" + j + "=" + e + ", binary:" + e);

		// ���
		int n = i ^ j;
		String f = Integer.toBinaryString(n);
		System.out.println(i + "^" + j + "=" + n + ", binary:" + f);

		int n1 = i ^ i;// �κ������Լ���򣬶�����0
		int n2 = i ^ 0;// �κ�����0������򣬶������Լ�
		String f1 = Integer.toBinaryString(n1);
		String f2 = Integer.toBinaryString(n2);
		System.out.println(i + "^" + i + "=" + n1 + ", binary:" + f1);
		System.out.println(i + "^0" + "=" + n2 + ", binary:" + f2);

		// ȡ��
		int p = ~i;
		String g = Integer.toBinaryString(p);
		System.out.println("~" + i + "=" + p + ", binary:" + g);

		// ���ơ�����
		byte r = 6;
		String h = Integer.toBinaryString(r);
		int r1 = r << 1;
		int r2 = r >> 1;
		System.out.println(r + " binary:" + h);
		System.out.println(r + "����һλ��" + r1 + ", binary:" + Integer.toBinaryString(r1));
		System.out.println(r + "����һλ��" + r2 + ", binary:" + Integer.toBinaryString(r2));

		byte s = 2;
		int s1 = 2 << 4;
		System.out.println(s + "x 16 =" + s1 + ", binary:" + Integer.toBinaryString(s1));

		// ����������
		int t = -10;
		System.out.println(t + ", binary:" + Integer.toBinaryString(t));

		// �������������������� >> ������е�λ���ƣ�������ǰ�油0
		// ���ڸ��������������� >> ������е�λ���ƣ�������ǰ�油1

		// -10����������1λ���ƶ���ǰ�油��1
		int t1 = t >> 1;
		System.out.println(t + "����������1λ��" + t1 + ", \t\tbinary:" + Integer.toBinaryString(t1));

		// -10�޷���������1λ������λҲ�������ƣ���1λ�ͱ����0
		int t2 = t >>> 1;
		System.out.println(t + "�޷�������1λ��" + t2 + ", \tbinary:" + Integer.toBinaryString(t2));

		int q1 = 3;
		int q2 = 2;
		int q3 = ((q1 | q2) ^ (q1 & q2)) << 2 >>> 1;
		System.out.println("q3= " + q3 + ", binary:" + Integer.toBinaryString(q3));
	}
}
