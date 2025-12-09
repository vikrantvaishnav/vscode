package Test;

public class ShapeCalculator {

	    
	    void main(){
	    double side = Double.parseDouble(IO.readln());

	    double a = Double.parseDouble(IO.readln());
	    double b = Double.parseDouble(IO.readln());
	    double c = Double.parseDouble(IO.readln());

	    Shape s = new Square();
	    IO.println("Square Area: "+s.area(side));
	    IO.println("Square Perimeter: "+s.perimeter(side));

	    IO.println();
	    Triangle t = new Triangle();
	    IO.println("Triangle Area: "+t.area(a,b,c));
	    IO.println("Triangle Perimeter: "+t.perimeter(a,b,c));
	}
	}
	abstract class Shape{

	    public abstract double area(double ...side);
	    public abstract double perimeter(double ...side);



	}

	class Square extends Shape{
	    
	    @Override
	    public double area(double ...side){
	        return (side[0]*side[0]);
	    }

	    @Override
	    public double perimeter(double ...side){
	        return (4*side[0]);
	    }
	}

	class Triangle extends Shape{

	    @Override
	    public double area(double ...side){
	        return (side[0]+side[1]+side[2])/2;
	    }

	    @Override
	    public double perimeter(double ...side){
	        return (side[0]+side[1]+side[2]);
	    }
	}
