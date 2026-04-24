package test;
//부모 클래스

public class AnimalParent{
String name;
int age;


void speak() {
	System.out.println("이름"+name);
	System.out.println("나이:"+age);
}
void info() {
	
	
}
AnimalParent(String name, int age){
	this.name = name;
	this.age = age;
}
}
