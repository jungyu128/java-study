
package staticex;

class Count2{
   // [static 변수]
    // 객체를 만들지 않아도 메모리에 딱 하나만 생성되는 '공용 변수'예요.
    // 모든 객체가 이 변수 하나를 같이 사용(공유)합니다.
   static int cnt = 0;
   
   // [static 메서드]
    // 객체 생성(new) 없이 '클래스이름.메서드이름()'으로 바로 부를 수 있어요.
    // 마을 회관에 있는 공용 스피커처럼 누구나 바로 접근 가능합니다.
   static void increase() {
      cnt++;
   }
}

public class StaticTest2 {
   public static void main(String[] args) {
      
      // Count2 c = new Count2(); 같은 객체 생성 코드가 없죠?
        // static 메서드이기 때문에 클래스 이름인 'Count2'로 직접 부를 수 있어요.
      
      Count2.increase();   // 첫 번째 호출: cnt가 0에서 1이 됩니다.
      Count2.increase();   // 두 번째 호출: cnt가 1에서 2가 됩니다. (공용이라 숫자가 누적됨!)
      
      // 변수도 static이니까 객체 없이 바로 가져와서 출력!
      System.out.println("count "+ Count2.cnt);
      
   }
}
