package com.ljjava.oo;

public class LogicOperator {
	public static void main(String[] args) {
		int i = 2;
		System.out.println(i == 1 & i++ == 2); // ��·�룬���۵�һ�����ʽ��ֵ��true��false���ڶ������ʽ���ᱻ���㡣�����������i++���ᱻִ�У�i��ֵ�����3
		System.out.println("i = " + i);

		int j = 2;
		System.out.println(j == 1 && j++ == 2); // ��·�룬ֻҪ��һ�����ʽ��ֵΪfalse,�ڶ������ʽ��ֵ�Ͳ������㡣��Ϊj==1����false�������ұߵ�j++��û��ִ���ˣ�j��ֵ����2
		System.out.println("j = " + j);

		int m = 2;
		System.out.println(m == 1 | m++ == 2); // ��·�����۵�һ�����ʽ��ֵ��true��false���ڶ������ʽ���ᱻ���㡣�����������m++���ᱻִ�У�m��ֵ�����3
		System.out.println("m = " + m);

		int n = 2;
		System.out.println(n == 2 || n++ == 2); // ��·��ֻҪ��һ�����ʽ��ֵΪtrue,�ڶ������ʽ��ֵ�Ͳ������㡣��Ϊn==2����true�������ұߵ�n++��û��ִ���ˣ�n��ֵ����2
		System.out.println("n = " + n);

		boolean k = true;
		System.out.println("k=" + k);
		System.out.println("kȡ��" + !k);

		// ���
		// ��ͬ��������
		// ��ͬ�����ؼ�
		boolean a = true;
		boolean b = false;
		System.out.println("a^b��" + (a ^ b));
		System.out.println("a^!b��" + (a ^ !b));
		System.out.println("!a^b��" + (!a ^ b));
		System.out.println("!a^!b��" + (!a ^ !b));
		
		// ��ϰ
		int y = 1;
		boolean z = !(y++ == 3) ^ (y++ ==2) && (y++==3);
		System.out.println(z); // false
		System.out.println(y); // 3
	}
}
