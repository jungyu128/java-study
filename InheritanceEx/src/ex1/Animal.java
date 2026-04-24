package ex1;

public class Animal {
    String name;
    int age;
    String color;

    public void eat() {
        System.out.println(name + "가 먹이를 먹습니다.");
    }

    public void sleep() {
        System.out.println(name + "가 잠을 잡니다.");
    }

    public void show() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(color);
    }
}

// Dog 클래스를 Animal.java 파일 안에 둘 경우 public을 빼야 합니다.
