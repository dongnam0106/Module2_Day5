package circle;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.crypto.spec.PSource;

class Circle {
    private double radius = 1.0;
    private String color = "Red";

    Circle(){

    }

    Circle(double r){
        this.radius = r;
    }

    void display(){
        System.out.println("Hình tròn bán kính " + radius + " màu " + color);
    }

    double getRadius(double radius) {
        return radius;
    }

    double getArea() {
        return 2*radius*3.14;
    }
}

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.display();
        System.out.println("Chu vi hình tròn là: " + circle.getArea());
    }
}
