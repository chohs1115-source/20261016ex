
public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 데이터 타입
		 * 메모리에 저장할 데이터의 종류에 따라 할당 받는 메모리 크기가 다르게 되는데요,
		 * 각각의 메모리 크기에 따라 데이터 종류를 구분하는 것을 말합니다.
		 * 
		 * 데이터 타입 중요한 이유
		 * : 오버플로우, 언더플로우 방지
		 * 
		 * 메모리 단위
		 * 1bit(비트) > 메모리 최소 단위
		 * 8bit(비트) > 1byte(바이트)
		 * 1024Byte > 1KB(키로 바이트)
		 * 1024KB(키로 바이트) > 1MB(메가 바이트)
		 * 1024MB(메가 바이트) > 1GB(기가 바이트)
		 * 1024GB(기가 바이트) > 1TB(테라 바이트)
		 */
		
		// 정수 데이터 타입
		/*
		 * byte		1byte	-128 ~ 127
		 * short	2byte	-32,768 ~ 32,767
		 * int		4byte	-2,147,483,648 ~ 2,147,483,647
		 * long		8byte	-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		 */
		
		byte byteNum = 115;
		System.out.println("byteNum: " + byteNum);
		
// 		byteNum = byteNum + 1; error
		
		byte byteNum01 = -128;
		System.out.println("byteNum01: " + byteNum01); //-129(x) 127(o)
		
		byteNum01 = (byte)(byteNum01-1);
		System.out.println("byteNum01: " + byteNum01);
		
		short shortNum = 22768;
		System.out.println("shortNum: " + shortNum);
		
		int intNum = 1147483648;
		System.out.println("intNum: " + intNum);
		
		int intNum01 = -2147483648;
		System.out.println("intNum01: " + intNum01);  // -2147483648
		
		intNum01 = intNum01 -1;
		System.out.println("intNum01: " + intNum01); // -2147483649(x) 2147483647(o)
		
		long longNum = 7223372036854775808L;
		System.out.println("longNum: " + longNum);
		
		System.out.println("byte 최솟값: " + Byte.MIN_VALUE);
		System.out.println("byte 최댓값: " + Byte.MAX_VALUE);
		
		System.out.println("short 최솟값: " + Short.MIN_VALUE);
		System.out.println("short 최댓값: " + Short.MAX_VALUE);
		
		System.out.println("int 최솟값: " + Integer.MIN_VALUE);
		System.out.println("int 최댓값: " + Integer.MAX_VALUE);
		
		System.out.println("long 최솟값: " + Long.MIN_VALUE);
		System.out.println("long 최댓값: " + Long.MAX_VALUE);
		
		// 실수(부동소수점)

		/*
		 * float 	4byte
		 * double 	8byte
		*/

		float floatNum = 3.14f;
		System.out.println("floatNum: " + floatNum);

		double doubleNum = 3.14159265358979;
		System.out.println("doubleNum: " + doubleNum);

		System.out.println("float 최솟값: " + Float.MIN_VALUE);
		System.out.println("float 최댓값: " + Float.MAX_VALUE);

		System.out.println("double 최솟값: " + Double.MIN_VALUE);
		System.out.println("double 최댓값: " + Double.MAX_VALUE);

		float num1 = 3.14159265358979323846264338327950288f;
		double num2 = 3.14159265358979323846264338327950288d;

		System.out.println("num1:" + num1);
		System.out.println("num2:" + num2);
		
		//논리 데이터 타입
		//참(true), 거짓(false)
		//boolean 	1byte	 true, false

		boolean flag = true;
		System.out.println("flag: " + flag);
		
		
		//문자와 문자열 데이터 타입
		//문자
		/*
		* 메모리에 문자 데이터를 저장하기 위해서 사용하는 데이터 타입
		* char		2byte
		*/

		char ch = 'a';
		// char ch = "a";

		System.out.println("ch: " + ch);
		ch = 'b';
		System.out.println("ch: " + ch);
		// ch = 'hello'; 		error
		
		//빈문자(empty) vs 공백문자(space)
		//char char1 = '' ; 문자 하나 있어야 하는데 비어있어서 에러
		//char char2 = ' ' ; 가능
		//문자는 메모리에 저장될 때 정수(유니코드)로 저장이 된다.

		char char1 ='A';
		System.out.println("char1: " + char1);

		int unicode = char1;
		System.out.println("unicode: " + unicode);		//65

		char char3 = 'ㄱ';
		System.out.println("char3: " + char3);			//ㄱ

		unicode = char3;
		System.out.println("unicode: " + unicode);		//12593

		char char4 = 65;
		System.out.println("char4: " + char4);			//A

		char4 = 12593;
		System.out.println("char4: " + char4);

		//문자열
		//String

		String str1 = "Hello";
		System.out.println("str1: " + str1);

		str1 = "";
		str1 = " ";
		
	}

}
