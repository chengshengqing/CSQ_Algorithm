package heap;

public class Test {
	public static void main(String[] args)  {
		Shape shape = new Circle();
        System.out.println(shape.name);
        shape.getT();
        shape.printType();
        shape.printName();
    }
}
 
class Shape {
    public String name = "shape";
    public final int t = 1;
     
    public Shape(){
        System.out.println("shape constructor");
    }
     
    public void printType() {
        System.out.println("this is shape");
    }
     
    public static void printName() {
        System.out.println("shape");
    }

	public int getT() {
		System.out.println("t======1");
		return t;
	}
}
 
class Circle extends Shape {
    public String name = "circle";
    public final int t = 2;
     
    public Circle() {
        System.out.println("circle constructor");
    }
     
    public void printType() {
        System.out.println("this is circle");
    }
     
    public static void printName() {
        System.out.println("circle");
    }
    
    public final int getT() {
    	System.out.println("t======2");
		return t;
	}
}
