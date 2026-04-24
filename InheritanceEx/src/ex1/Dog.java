package ex1;

// 자식 클래스
public class Dog extends Animal {
    // 1. bark() 메서드
    public void bark() {
        System.out.println(name + "은 멍멍 짖습니다.");
    }

    // 2. run() 메서드
    public void run() {
        System.out.println(name + "은 잘 달립니다.");
    }

    // 3. show() 메서드 (부모의 show와 이름이 겹치면 재정의됩니다)
    public void show() {
        System.out.println("이름: " + name + ", 나이: " + age + ", 색상: " + color);
    }
}