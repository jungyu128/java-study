package test;
//설계도
class Car{
	String model; //멤버변수 선언
	int speed;
	
	//생성자[매개변수 2개,model,speed]
	Car(String model, int speed){
	this.model = model;	
	this.speed = speed;	
	}
	//매서드
	void print() {
		System.out.println(model+ ","+speed);
	
	}
}
public class Ex04 {
public static void main(String[] args) {
	//객체생성(생성자)
	Car c1 = new Car("sonata", 100);
	Car c2 = new Car("avante", 120);
	c1.print();
	c2.print();
}
}
