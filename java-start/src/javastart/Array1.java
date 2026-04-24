package javastart;

class Circle {
    int radius; 

    Circle(int radius) {
        this.radius = radius;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }
}

public class Array1 {
    public static void main(String[] args) {
        Circle[] c;           
        c = new Circle[5];    
        
        for (int i = 0; i < c.length; i++) {
            c[i] = new Circle(i+1);
            
        }
        for(int i = 0; i < c.length; i++) {
        	System.out.println("원의 넓이:"+c[i].getArea());
        }
    }
}