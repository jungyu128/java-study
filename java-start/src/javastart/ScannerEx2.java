package javastart;

import java.util.Scanner;

public class ScannerEx2 {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      String pro;
      int price;
      double quan;
      boolean mem;
      
      System.out.print("가격 : ");
      price = sc.nextInt();
      
      System.out.print("수량 : ");
      quan = sc.nextDouble();
      
      sc.nextLine();
      System.out.print("상품명 입력 : ");
      pro = sc.nextLine();
      //문자열을 입력 -> 숫자 입력 -> 문제없음
      //숫자 -> 문자열 -> 엔터키를 상쇄 sc.nextLine();
      
      System.out.print("회원 여부 (true/false) : ");
      mem = sc.nextBoolean();
      
      //총금액(tot) : 수량 * 가격
      int tot = (int)quan * price;
      
      //할인 적용 : 회원(true)이면 10% 할인
      if(mem) {
         System.out.print("10% 할인된 가격 : ");
         System.out.println((int)(tot*0.9));
      }
      
      System.out.println("상품명 : "+pro);
      System.out.println("가격 : "+price);
      System.out.println("수량 : "+quan);
      
      if(mem) {   //boolean이면 mem == true
         System.out.println("회원입니다.");
      }
      else {
         System.out.println("회원이 아닙니다.");
      }
      
      sc.close();
   }
}