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
			
		
		
		System.out.println("이름을 입력하시오: ");
		name=sc.next();
		System.out.println("나이를 입력하시오: ");
		age=sc.nextInt();
		System.out.println("전화번호를 입력하시오(-를 포함해서): ");
		tel=sc.next();
		System.out.println("회비를 입력하시오: ");
		money=sc.nextInt();
		
		}
		
		
		
		
		
		
		
		
		System.out.println("=========================================");
		System.out.println("이름\t 나이\t 전화번호 \t 회비 \t");
		System.out.println("=========================================");
		for (int a=0;a<3;a++) {
			System.out.println(name+"\t"+"\""+age+"\""+"\t"+tel+"\t"+"\\"+money);
			
		}
		
		
		System.out.println("-----------------------------------------");
		System.out.println("총합계\t\t\t\t"+"\\"+total);
		System.out.println("-----------------------------------------");
		}
		
		/*System.out.println("=========================================");
		System.out.println("이름\t 나이\t 전화번호 \t 회비 \t");
		System.out.println("=========================================");
		System.out.println("홍길동\t"+"\""+15+"\""+"\t"+3672+"-"+1234+"\t"+"\\"+20000);
		System.out.println("고길동\t"+"\""+13+"\""+"\t"+2238+"-"+1234+"\t"+"\\"+30000);
		System.out.println("김말이\t"+"\""+15+"\""+"\t"+1234+"-"+1234+"\t"+"\\"+50000);
		
		System.out.println("-----------------------------------------");
		System.out.println("총합계\t\t\t\t"+"\\"+100000);
		System.out.println("-----------------------------------------");
		*/
		
	

}
