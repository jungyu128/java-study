package javastart;

class Book2 { 
    String title;
    String author;

    // 생성자 1: 매개변수 없음
    Book2() {
//   title = "";       
//   author = "";      
     this("", "");     
     System.out.println("기본생성자 호출");
    }

    // 생성자 2: 제목만 받음
    Book2(String title) {
      
        this(title, "작가미상"); 
       
    }

 
    Book2(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void show() {
     
        System.out.println("책제목: " + title + " 작가: " + author);
    }
}

public class BookMain {
    public static void main(String[] args) {
        
        Book2 b1 = new Book2();
        Book2 b2 = new Book2("심청전");
        Book2 b3 = new Book2("폭풍의 언덕", "에밀리브론테");

        b1.show();
        b2.show();
        b3.show();
    }
}