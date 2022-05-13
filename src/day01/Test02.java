package day01;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		String name;
		int age;
		String add;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름: ");
		name=scan.next();
		System.out.println("나이: ");
		age=scan.nextInt();
		System.out.println("주소:");
		add=scan.next();
		System.out.println("이름:"+"\""+name+"\""+" 나이:"+"\""+age+"\""+" 주소:"+"\""+add+"\""+"가 맞습니까?");
		
		
		// \n: 엔터와 비슷 \t:탭 크기만큼 왼쪽으로 이동
		// \":(큰 따움표 표현),\\: 역슬러시 하나 표현
		
		
		System.out.println("안\n녕\n하\t세요");
		
	
		/*System.out.println("이름 : 홍길동");
		System.out.println("나이:20살");
		System.out.println("주소: 산골짜기");*/

	}

}
