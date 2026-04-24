package ex1;

public class Main {
    public static void main(String[] args) {
        // Dog 객체 생성
        Dog d = new Dog();

        System.out.println("--- 부모 멤버 사용 ---");

        d.name = "토리";
        d.age = 3;
        d.color = "오렌지레드";

        System.out.println(d.name + " / " + d.age + "살 / " + d.color);

        d.eat();
        d.sleep();
        d.bark();
        d.run();
        d.show();
    }
}