package javastart;

class Car{   

   String model; 
   int speed; 
    
   Car(String model, int speed){
      this.model = model;                             
      this.speed = speed;
      //this: 왼쪽 변수-객체변수, 오른쪽 변수-매개변수
      //this : 객체 자신
   }
   
   Car(String model){
      this.model = model;
      speed = 0;
   }
   
   Car(){
      model = "truck";
      speed = 0;
   }
   
   
   void showPrint(){
      System.out.print(model+",");
      System.out.println(speed);
   }
}

public class MainCar {
   public static void main(String[] args) {   
      Car c1 = new Car("Sonata",100);
      Car c2 = new Car("Avante",80);
      Car c3 = new Car("genesis");
      Car c4 = new Car();
      
      
//      myBook.title = "자바의 정석";  //  .(점)은 맴버 접근 연산자
//      myBook.price = 20000;
      c1.showPrint(); 
      c2.showPrint();
      c3.showPrint();
      c4.showPrint();
   } 
}