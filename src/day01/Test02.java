package day01;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		String name;
		int age;
		String add;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�̸�: ");
		name=scan.next();
		System.out.println("����: ");
		age=scan.nextInt();
		System.out.println("�ּ�:");
		add=scan.next();
		System.out.println("�̸�:"+"\""+name+"\""+" ����:"+"\""+age+"\""+" �ּ�:"+"\""+add+"\""+"�� �½��ϱ�?");
		
		
		// \n: ���Ϳ� ��� \t:�� ũ�⸸ŭ �������� �̵�
		// \":(ū ����ǥ ǥ��),\\: �������� �ϳ� ǥ��
		
		
		System.out.println("��\n��\n��\t����");
		
	
		/*System.out.println("�̸� : ȫ�浿");
		System.out.println("����:20��");
		System.out.println("�ּ�: ���¥��");*/

	}

}
