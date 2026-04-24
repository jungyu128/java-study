package javastart;

import java.util.Scanner;

public class ConventType { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 문자로 입력하세요 :");
        
      
        String a = sc.nextLine(); 
   
      
        double d = Double.parseDouble(a);
        
       
        String str1 = Double.toString(d);
        String str2 = String.valueOf(d);
        
        System.out.println("input 값(문자열 a): " + a);
        System.out.println("d 값(실수 변환): " + d);
        System.out.println("str1 값(toString): " + str1);
        System.out.println("str2 값(valueOf): " + str2);
        
        sc.close();
    }
}

//package javastart;
//
//import java.util.Scanner;
//
//public class ConventType { 
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("숫자를 문자로 입력하세요 :");
//        
//        // 1. input (문자열 입력)
//        String a = sc.nextLine(); 
//   
//        // 2. 문자열 a를 실수 d로 변환
//        double d = Double.parseDouble(a);
//        
//        // 3. 실수 d를 다시 문자열 str1, str2로 변환
//        String str1 = Double.toString(d);
//        String str2 = String.valueOf(d);
//        
//        // 4. 요청하신 모든 값 출력
//        System.out.println("input 값(문자열 a): " + a);
//        System.out.println("d 값(실수 변환): " + d);
//        System.out.println("str1 값(toString): " + str1);
//        System.out.println("str2 값(valueOf): " + str2);
//        
//        sc.close();
//    }
//}