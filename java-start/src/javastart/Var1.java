package javastart;

public class Var1 {
public static void main(String[] arg) {
	int a = 100; //정수(4바이트)
	long l = 10000000000L; //정수(8바이트), 값에 L붙임
	float f = 10.5f; //실수(4바이트), 값에 c붙임
	boolean c = true; // true, false 입력가능, 1바이트
	double b = 10.5; //실수(8바이트)
	char d = 'A'; //문자 하나, 문자 하나가 2바이트
	String e = "Hello java"; //문자열, 문자열을 다루기 위한 특별한타임 *대문자 S
	
	System.out.println(a);
	System.out.println(l);
	System.out.println(f);
	System.out.println(c);
	System.out.println(b);
	System.out.println(d);
	System.out.println(e);
    System.out.println("" + a + l + f + c + b + d + e);
    System.out.printf("%d %d %.1f %b %.1f %c %s%n", a, l, f, c, b, d, e);
}
}
