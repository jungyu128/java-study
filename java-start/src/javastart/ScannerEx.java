package javastart;

import java.util.Scanner; 
public class ScannerEx {
public static void main(String[] args) {
	                     
Scanner sc = new Scanner(System.in);
// 객체생성
// Scanner : 클래스이름
// System.in : 키보드로 입력한다.
// Scanner sc -> Scanner(클래스, 타입 ), sc->참조변수

System.out.print("이름 입력:");
String name = sc.nextLine();

System.out.print("주소 입력:");
String adress = sc.nextLine();

System.out.print("나이 입력:");
int age = sc.nextInt();

System.out.print("체중 입력: ");
double weight = sc.nextDouble();

System.out.print("결혼 여부(true/false):");
boolean mar = sc.nextBoolean();

System.out.print("\n--- 입력 결과 ---");
System.out.print("이름: " + name);
System.out.print("주소: " + adress);
System.out.print("나이: " + age);
System.out.print("체중: " + weight);
System.out.print("결혼 여부: " + mar);

sc.close(); //입력도구 종료, 자원정리
}
}