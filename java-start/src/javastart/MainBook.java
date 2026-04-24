package javastart;

class Book{   //클래스(설계도) 생성
   //클래스 = 맴버변수(필드)(속성) + 메서드(기능) 구성
   String title; //맴버변수
   int price; //맴버변수
    //매서드 정의 (기능 행위)
   Book(String n, int s){
      title = n;
      price = s;
   }
   Book(String i){
      title = i;
      price = 0;
   }
   Book(){
      title = "C언어의 정석";
      price = 0;
   }
   
   void showPrice(){
      System.out.println("도서 제목 : "+title);
      System.out.println("가격 : "+price);
   }
}

public class MainBook {   //실행하는 클래스
   public static void main(String[] args) {   //main method
      Book myBook = new Book("자바의 정석",20000);   //객체(인스턴스) 생성
      Book myBook2 = new Book("파이썬 정석가모니");
      Book myBook3 = new Book();
      //Book() : 클래스
      //new : 객체 생성 연산자
      //myBook : 참조변수, 객체 생성
      
      
//      myBook.title = "자바의 정석";  //  .(점)은 맴버 접근 연산자
//      myBook.price = 20000;
      myBook.showPrice(); //메서드 호출
      myBook2.showPrice();
      myBook3.showPrice();
   }
}