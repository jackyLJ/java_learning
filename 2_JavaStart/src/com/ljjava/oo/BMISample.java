package com.ljjava.oo;

import java.util.Scanner;

public class BMISample {
	public static void main(String[] args) {
		System.out.println("请输入您的体重（KG），身高（米）");
		Scanner s = new Scanner(System.in);
		float weight = s.nextFloat();
		System.out.println("您的体重为：" + weight + "KG");
		float height = s.nextFloat();
		System.out.println("您的身高为：" + height + "米");

		float bmi = weight / (height * height);
		System.out.println("您的BMI指数为：" + bmi);

		if (bmi < 18.5) {
			System.out.println("您的体重过轻");
		} else if (bmi >= 18.5 && bmi < 24) {
			System.out.println("您的体重在正常范围");
		} else if (bmi >= 24 && bmi < 27) {
			System.out.println("您的体重过重");
		} else if (bmi >= 27 && bmi < 30) {
			System.out.println("您有轻度肥胖");
		} else if (bmi >= 30 && bmi < 35) {
			System.out.println("您有中度肥胖");
		} else if (bmi >= 35) {
			System.out.println("您有重度肥胖");
		}
	}
}
