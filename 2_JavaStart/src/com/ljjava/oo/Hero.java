package com.ljjava.oo;

public class Hero {
	String name; // ����
	float hp; // Ѫ��
	float armor; // ����
	int moveSpeed; // �ƶ��ٶ�

	// �Ӷ���
	void keng() {
		System.out.println("�Ӷ��ѣ�");
	}

	// ��ȡ����ֵ
	float getArmor() {
		return armor;
	}

	// �����ƶ��ٶ�
	void addSpeed(int speed) {
		moveSpeed = moveSpeed + speed;
	}

	// ����
	void legendary() {

	}

	// ��ȡ��ǰѪ��
	float getHp() {
		return hp;
	}

	// ��Ѫ
	void recovery(float blood) {
		hp = hp + blood;
	}

	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "����";
		garen.hp = 616.28f;
		garen.armor = 27.536f;
		garen.moveSpeed = 350;

		Hero teemo = new Hero();
		teemo.name = "��Ī";
		teemo.hp = 383f;
		teemo.armor = 14f;
		teemo.moveSpeed = 330;

		garen.addSpeed(120);
		
		System.out.println("done...");
	}
}
