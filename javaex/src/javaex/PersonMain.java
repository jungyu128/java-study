package javaex;

class Person{
   private int age;//private : 그 클래스만 접근

   public int getAge() { //get~: 값을 변환
      return age;
   } 

   public void setAge(int age) {// set~: 값을 설정
      //나이가 1~100세 까지 -> "나이 입력 오류(1~100세 입력)"
      if(age>=1 && age<=100) {
         this.age = age;
         }
      else {
         System.out.println("나이 입력 오류(1~100세 입력)");
      }
   }
   
}

public class PersonMain {
   public static void main(String[] args) {
      Person p = new Person();
      //p.age = -10; private-> 직접 접근 안됨ㅕw46uw
      p.setAge(25);
      System.out.println("현재나이 : "+p.getAge());
   }
}
