package pack2;

import pack1.Parent;

public class Child extends Parent{   //Parent 에서 상속 Parent에 변수 저장되어있어서 괜찮음
   public void printChild() {
      System.out.println("=== 자식 클래스 접근 ===");
      System.out.println("public a = "+ a);
      System.out.println("protected b = "+ b);
      //System.out.println("default c = "+ c);   //default는 같은 패키지안에 다른 클래스 접근 허용 (패키지가 다르기 때문)
      //default : 동일패키지
      //System.out.println("private d = "+ d);   //private 같은 클래스에서만 접근 허용, 상속 클래스 접근 안되므니다
      //private: 동일 클래스만
   }
}
