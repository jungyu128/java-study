package javastart;

import java.util.Scanner;

class BookA{
      String title;
      int price;
      
      BookA(String title,int price){
         this.title = title;
         this.price = price;
         
      }
      
   }


public class BookArray {
   public static void main(String[] args) {   
      BookA [] b = new BookA[3];
      Scanner sc = new Scanner(System.in);
      
      for(int i = 0; i<b.length;i++) {
         System.out.print("제목 입력 : ");
         String title = sc.nextLine();
         System.out.print("가격 입력 : ");
         int price = sc.nextInt();
         sc.nextLine();
         System.out.println("");
         b[i] = new BookA(title,price);
      }
      
      for(int i = 0; i<b.length;i++) {
         System.out.println("제목 : "+b[i].title+" "+"가격 : "+b[i].price);
         
         System.out.println("");
      }
      sc.close();
      
   }
}
