package com.ljjava.oo;

public class types {
	public static void main(String[] args) {
		long val = 26L; // ����long����
		int decVal = 26; // Ĭ��Ϊint����
		int hexVal = 0x1a; // 16����
		int oxVal = 032; // 8����
		int binaryVal = 0b11010; // 2����

		System.out.println("long:" + val);
		System.out.println("decimal int:" + decVal);
		System.out.println("hex int:" + hexVal);
		System.out.println("ox int:" + oxVal);
		System.out.println("binary int:" + binaryVal);

		float f1 = 123.4F; // float����
		double d1 = 123.4; // Ĭ��Ϊdouble����
		double d2 = 1.234e2; // ��ѧ��������ʾdouble

		// byte b = 130;

		System.out.println("float:" + f1);
		System.out.println("dobule:" + d1);
		System.out.println("double e:" + d2);

		char c = 'c';
		String name = "ţţ";

		System.out.println(c);
		System.out.println(name);

		// ת���ַ�
		char tab = '\t'; // �Ʊ��
		char carriageReturn = '\r'; // �س�
		char newLine = '\n'; // ���з�
		char doubleQuote = '\"'; // ˫����
		char singleQuote = '\''; // ������
		char backSlash = '\\'; // ��б��

		System.out.println("�Ʊ��[" + tab + "]");
		System.out.println("�س���[" + carriageReturn + "]");
		System.out.println("���з�[" + newLine + "]");
		System.out.println("˫����[" + doubleQuote + "]");
		System.out.println("������[" + singleQuote + "]");
		System.out.println("��б��[" + backSlash + "]");
	}
}
