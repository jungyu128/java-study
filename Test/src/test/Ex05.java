package test;
class Book{
	String title;
	
	Book(String title){
		this.title = title;
	}
}
public class Ex05 {
public static void main(String[] args) {
	Book[] b = new Book[3];
	b[0] = new Book("good");
	b[1] = new Book("good");
	b[2] = new Book("good"); //b.length괄호 업승면 배열 잇으면 문잗열
	for(int i = 0; i < b.length; i++) {
		System.out.println(b[i].title);
	}
}
}
