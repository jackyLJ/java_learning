package com.ljjava.oo;

public class Operator {
	public static void main(String[] args) {
		int a = 5;
		long b = 6;
		int c = (int) (a + b); // ������κ����㵥Ԫ�ĳ��ȳ���int����ô�������Ͱ�����ĳ��ȼ���
		long d = a + b;

		byte b1 = 1;
		byte b2 = 2;
		byte s = (byte) (b1 + b2); // ����κ����㵥Ԫ�ĳ��ȶ�������int����ô�������Ͱ���int�����㡣����
									// ��Ȼa��b����byte���� ������������int���ͣ���Ҫǿ������ת��
		int s1 = b1 + b2;
		
		int i1 = 5;
		int j1 = 2;
		System.out.println(i1%j1);
		
		int i = 1;
		int j = ++i + i++ + ++i + ++i + i++;
		
		System.out.println(j);
	}
}
