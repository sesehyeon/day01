package day01;


/*
 
 bit:2진수의 한 자리가 1bit
 1byte :8bit
 
 type       크기       범위
 -------------------------------
 byte        1      -128~127
 short       2      -32768~32767
 char        2       0~65535
 int         4
 float       4
 double      8
 void       값을 갖지 않는 특수한 데이터 형
 
 
 */

public class Test04 {

	public static void main(String[] args) {
		int age=25;// int: 정수 (음수,양수) 표현
		double weight=55.0; //실수 표현
		double height=160.0;
		
		System.out.println("나의 나이는 "+age+"살");
		System.out.println("나의 키는 "+height+"cm");
		System.out.println("나의 몸무게는 "+weight+"kg");
		
		
		//char 문자 하나를 표현할 때 사용
		//문자 하나는 작은 따옴표로 표현해야 한다.
		char ch='a';
		
		System.out.println(ch);

	}

}
