package javastart;

import java.util.Scanner;

class StudentP{
    String name;
    int score;
    
    StudentP(String name, int score){
       this.name = name;
       this.score = score;
    }
    
 }

public class StudentScore {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("학생수를 입력하세요 : ");
      int cnt = sc.nextInt();
      sc.nextLine();
      //학생수만큼 배열 요소 생성
      StudentP[] stu = new StudentP[cnt];
      //반복문을 통해서 배열 요소 객체 생성
      //값을 키보드로부터 입력받음
      for(int i=0;i<stu.length;i++) {
         System.out.print((i+1)+"번째"+"학생 이름을 입력하세요 : ");
         String name = sc.nextLine();
         System.out.print((i+1)+"번째"+"학생의 점수를 입력하세요 : ");
         int score = sc.nextInt();   
         System.out.println();
         sc.nextLine();   
         stu[i] = new StudentP(name,score);
      }
      
      while(true) {
         int a = 0;
         System.out.print("검색할 이름은 : ");
         String sname = sc.nextLine();
         
         if(sname.equals("그만")) {
            break;
         }
         
         boolean k = false;
         for(int j = 0;j<stu.length;j++) {
            
            if(sname.equals(stu[j].name)) {
               System.out.println(sname+"의 점수는 : "+stu[j].score);
               //k=true;
               a=1;
               break;//가장 가까운 반복문을 탈출
            }//if
            
            }//for
         if(a==0) {//if (!k)
            System.out.println("못찾음");
         }//if   
      }//while
      sc.close();
      System.out.println("프로그램 종료");
   }
}
