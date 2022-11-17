class Shape
{
	void draw()
	{
		System.out.println("I am drawing a shape");


	}
	
	void erase()
	{
		System.out.println("I am erasing the shape");

	}

}

class Circle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("I am drawing circle");

	}
	@Override
	void erase()
	{
		System.out.println("I am erasing circle");

	}

}

class Triangle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("I am drawing triangle");
		

	}
	@Override
	void erase()
	{
		System.out.println("I am erasing triangle");
	}

}
class Square extends Shape
{
	
	@Override
	void draw()
	{
		System.out.println("I am drawing square");
		

	}
	@Override
	void erase()
	{
		System.out.println("I am erasing square");
	}
	
}
public class Q3
{
	public static void main(String args[])
	{
		Shape c = new Circle();
		c.draw();
		c.erase();

		Shape t = new Triangle();
		t.draw();
		t.erase();

		Shape s = new Square();
		s.draw();
		s.erase();
	}
}