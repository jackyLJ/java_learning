package com.ljjava.oo;

//����������
public class VariableScope {
	int i = 5; // ��������Ϊi

	public void method(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		new VariableScope().method(10);
	}

	public void method1() {
		int i = 5;
		System.out.println(i);
		{// �ӿ�
			System.out.println(i);
			int j = 6;
			System.out.println(j);
		}

		// System.out.println(j);
	}
	
	public void finalMethod(final int j){
		// j = 3;
	}
}
