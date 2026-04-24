package javastart;

import java.util.Scanner;

class Person {
	String name;
	int age;
	
	 Person(String name, int age){
	      this.name = name;                             
	      this.age = age;
	 }
	      Person(String name){
	    	this.name = name;
	    	age = 0;
	       }
	      void CheckAdult(){
	    	  System.out.println("이름:"+ name);
	    	  System.out.println("나이:"+ age);
	        if(age >= 19) {
	        	System.out.println("성인입니다.");
	        	  }
	        else if(age >= 10) {
	        	System.out.println("청소년 입니다.");
	        }
	        else{
	        	System.out.println("소인 입니다.");
	        }
	       }
	    }



public class Test1 {
	public static void main(String[] args) {
		
    Person p = new Person("john", 19);
    p.CheckAdult();
}
}