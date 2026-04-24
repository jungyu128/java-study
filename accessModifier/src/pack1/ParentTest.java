package pack1;

public class ParentTest {
   public static void main(String[] args) {
      Parent p = new Parent();
      System.out.println("=== 같은 패키지 테스트 ===");   //메서드가 없기때문에
      System.out.println("public a = "+ p.a);
      System.out.println("protected b = "+ p.b);
      System.out.println("default c = "+ p.c);
      //private는 동일 클래스 내에서만 접근 허용되기 때문
      //Parent의 d변수 : private -> 같은 클래스 에서만
      System.out.println("\n=== 메서드 호출 ===");
      p.show();
   }
   
}
