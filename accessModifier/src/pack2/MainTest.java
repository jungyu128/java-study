package pack2;

import pack1.Parent; //public 클래스는 어느 곳에서나 객체 생성 가능, 하지만 패키지가 다를 경우 import로 패키지.클래스 써야됌


public class MainTest{
   public static void main(String[] args){
      Parent pa = new Parent();
      Child ch = new Child();
      System.out.println("=== 같은 패키지 테스트 ===");   //메서드가 없기때문에
      System.out.println("public a = "+ pa.a);
//      System.out.println("protected b = "+ pa.b);
//      System.out.println("default c = "+ pa.c);   //같은 패키지에서만 접근 허용
//      System.out.println("private d = "+ pa.d);//private는 동일 클래스 내에서만 접근 허용되기 때문
      //Parent의 d변수 : private -> 같은 클래스 에서만
      System.out.println("\n=== 메서드 호출 ===");
      //자식 클래스 접근
      ch.printChild();
   }
}
