package day01;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		
		String name = null;
		int age = 0;
		String tel = null;
		int money = 0;
		int total = 0;
		
		
		for (int i=0;i<3;i++) {
			
		
		
		System.out.println("�̸��� �Է��Ͻÿ�: ");
		name=sc.next();
		System.out.println("���̸� �Է��Ͻÿ�: ");
		age=sc.nextInt();
		System.out.println("��ȭ��ȣ�� �Է��Ͻÿ�(-�� �����ؼ�): ");
		tel=sc.next();
		System.out.println("ȸ�� �Է��Ͻÿ�: ");
		money=sc.nextInt();
		
		}
		
		
		
		
		
		
		
		
		System.out.println("=========================================");
		System.out.println("�̸�\t ����\t ��ȭ��ȣ \t ȸ�� \t");
		System.out.println("=========================================");
		for (int a=0;a<3;a++) {
			System.out.println(name+"\t"+"\""+age+"\""+"\t"+tel+"\t"+"\\"+money);
			
		}
		
		
		System.out.println("-----------------------------------------");
		System.out.println("���հ�\t\t\t\t"+"\\"+total);
		System.out.println("-----------------------------------------");
		}
		
		/*System.out.println("=========================================");
		System.out.println("�̸�\t ����\t ��ȭ��ȣ \t ȸ�� \t");
		System.out.println("=========================================");
		System.out.println("ȫ�浿\t"+"\""+15+"\""+"\t"+3672+"-"+1234+"\t"+"\\"+20000);
		System.out.println("��浿\t"+"\""+13+"\""+"\t"+2238+"-"+1234+"\t"+"\\"+30000);
		System.out.println("�踻��\t"+"\""+15+"\""+"\t"+1234+"-"+1234+"\t"+"\\"+50000);
		
		System.out.println("-----------------------------------------");
		System.out.println("���հ�\t\t\t\t"+"\\"+100000);
		System.out.println("-----------------------------------------");
		*/
		
	

}
